/* Students information:
1- ARWA SAADAN ABDULLAH AL-SAADAN./ ID: 446201958.
2- SAFWA MOHAMEDAHMED ELYAS ABDALLA./ ID:446207694.
3- Dina Ibrahim Alyabis./ ID:446202768.

SECTION NUMBER:46412
Lab INUSTRUCTUR: Ghada Abdullah S Alamer.
*/

//Class with the main method implemented.
import static java.lang.Character.*;
import java.util.*;
public class BookWithUs {
	static Scanner user= new Scanner(System.in);
	
	public static Booking AddServices(Booking n) {
		int serv;
		do {
			System.out.println("choose services to add to your booking: ");
			System.out.println("1- Book Hotel");
			System.out.println("2- Rent a Car");
			System.out.println("3-Book a Flight");
			System.out.println("4-Back to the main menu!");
			serv=user.nextInt();
			switch(serv) {
			case 1:
				System.out.print("Which room type would you like to choose? (Suite: S, regular: any button): ");
				char room=toUpperCase(user.next().charAt(0));
				System.out.print("How many nights you want to stay?:  ");
				int night=user.nextInt();
				Service s;
				s=new Hotel(room,night);
				boolean state=n.addService(s);
				if(!state)
					System.out.println("unable to add more services");
				break;
			case 2: 
				System.out.print("Which Car type would you like to choose? (Luxury: L, regular: any button): ");
				char car=toUpperCase(user.next().charAt(0));
			    System.out.print("How many Days to rent the car?:  ");
			    int days=user.nextInt();
			Service c;
			c=new CarRental(car,days);
			boolean stateC=n.addService(c);
			if(!stateC)
				System.out.println("unable to add more services");
			break;
			
			case 3:
				Service f;
				System.out.print("What day you want to book the flight(1-30)?: ");
			    int depart=user.nextInt();
				System.out.print("What Class you want to book?(First class[F],Bussiness[B],Economy[any button]): ");
				char classtype=toUpperCase(user.next().charAt(0));
				System.out.print("is your flight international? (yes, no): ");
				String flight=user.next();
				if(flight.equalsIgnoreCase("Yes")) {
					System.out.print("Do you have a valid Visa? (yes, no):");
					String VisaFound=user.next();
					if(VisaFound.equalsIgnoreCase("Yes")) 
					f=new internationalFlights(depart,classtype,true);
					else f=new internationalFlights(depart,classtype,false);
				}
				else 
				f=new Flight(depart,classtype);
				boolean stateF=n.addService(f);
				if(!stateF)
					System.out.println("unable to add more services");
				break;
			default: break; }	
		}while(serv!=4);
		
		return n;
		
	}
	
	public static void main(String[] args) {
		String name, email, pass;
		System.out.println("Welcome to Book with us System, please create account to proceed..");
		System.out.println("Enter your information below to sign up!");
		System.out.print("Name: ");
		name = user.nextLine();
		System.out.print("Email: ");
		email = user.next();
		user.nextLine();
		System.out.print("Password: ");
		pass = user.next();
		user.nextLine();

		User user1 = new User(name, email, pass, 3);
		String id;
		String password;
		System.out.println("Login to your account");
		do {
			System.out.println("To exit the program, Enter x");
			System.out.println();
			System.out.print("Enter your name: ");
			id = user.next();

			if (id.equalsIgnoreCase("x")) {
				System.out.print("Programe Teminated!! ");
				System.exit(0);
			}

			System.out.print("Enter Password: ");
			password = user.next();

		} while (!user1.login(id, password));

		System.out.println("Login successful!");
		int choice;

		do {
			System.out.println("What would you like to do?");
			System.out.println("1-Make booking");
			System.out.println("2-Cancel booking");
			System.out.println("3-Confirm booking");
			System.out.println("4-Modify booking");
			System.out.println("5-Show booking history");
			System.out.println("6-Log out!");
			System.out.println("Enter your choice: ");
			choice = user.nextInt();
			switch (choice) {
			case 1:
				Booking b = new Booking();
				AddServices(b);
				if (b.getNumberOfServices() > 0) {
					user1.makeBooking(b);
					System.out.print(b.toString());
				}
				break;

			// cancel booking option :
			case 2:
				if (user1.getNob() == 0) {
					System.out.println("No Bookings Available!!");
					System.out.println();
					break;
				}

				System.out.print("Which booking you want to cancel? (1-2-3): ");
				int idBook = user.nextInt();
				user1.cancelBooking(idBook);

				break;
			// confirm a booking(by default booking is not confirmed).
			case 3:
				if (user1.getNob() == 0) {
					System.out.println("No Bookings Available!!");
					System.out.println();
					break;
				}

				System.out.print("Which booking you want to confirm? (1-2-3): ");
				int cBook = user.nextInt();
				user1.confirmBooking(cBook);
				break;
			case 4:
				if (user1.getNob() == 0) {
					System.out.println("No Bookings Available!!");
					System.out.println();
					break;
				}

				System.out.println("What you would like to do? ");
				System.out.println("1-delete booking ");
				System.out.println("2-Add service ");
				System.out.println("3-delete service ");
				int option = user.nextInt();
				switch (option) {
				case 1:
					System.out.print("Which booking you want to delete? (1-2-3): ");
					int dBook = user.nextInt();
					user1.deleteBooking(dBook);
					break;
				case 2:
					System.out.print("Which booking you want to Add a service To? (1-2-3): ");
					int aService = user.nextInt();
					Booking v = user1.findBooking(aService);
					if (v != null)
						AddServices(v);
					else
						System.out.print("Booking not found!! ");
					break;
				case 3:
					System.out.print("Which booking you want to delete a service from? (1-2-3): ");
					int dService = user.nextInt();
					Booking r = user1.findBooking(dService);
					System.out.print("Which service you want to delete? (1-2-3): ");
					int serviceId = user.nextInt();
					r.DeleteService(serviceId);
					break;
				default:
					System.out.println("invalid selection!!");
					break;
				}
				break;

			case 5:
				if (user1.getNob() == 0) {
					System.out.println("No bookings found!!");
					System.out.println();
					break;
				}

				Booking[] array = user1.getBookList();
				for (int i = 0; i < user1.getNob(); i++) {
					System.out.println(array[i].toString());
				}

				break;
			case 6:
				user1.logout();
				return;
			default:
				System.out.println("Invalid entry!! ");
				break;
			}

		} while (choice >= 1 && choice < 6);

	}

	}


