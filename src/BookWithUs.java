/* Students information:
1- ARWA SAADAN ABDULLAH AL-SAADAN./ ID: 446201958.
2- SAFWA MOHAMEDAHMED ELYAS ABDALLA./ ID:446207694.
3- Dina Ibrahim Alyabis./ ID:446202768.

SECTION NUMBER:46412
Lab INUSTRUCTUR: Ghada Abdullah S Alamer.
*/

//Class with the main method implemented.



//must add a message whrn service is added successfully, messages must be displayed in the main not the classes in
//in case of , cancell booking, delete booking, confirm booking,make a service, delete a service or any action.

import static java.lang.Character.*;
import java.util.*;
public class BookWithUs {
	static Scanner user= new Scanner(System.in);
	
	public static boolean passwordValid(String pass) {
		char c;
		for(int l=0;l<pass.length();l++) {
			c=pass.charAt(l);
			if(isUpperCase(c))
				return true;}
		return false;
	}
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
				if(night<1) {
					System.out.println("invalid entry, nights must be 1 or more!!");
				break;}
				Service s;
				s=new Hotel(room,night);
				boolean state=n.addService(s);
				if(state) {
					System.out.println("\nService Added Successfully");
					System.out.print("\n-------------------------\n");}
				else {
					System.out.println("\nunable to add more services");
					System.out.print("\n-------------------------\n");}
				break;
			case 2: 
				System.out.print("Which Car type would you like to choose? (Luxury: L, regular: any button): ");
				char car=toUpperCase(user.next().charAt(0));
			    System.out.print("How many Days to rent the car?:  ");
			    int days=user.nextInt();
			    if(days<1) {
					System.out.println("invalid entry, rental days must be 1 or more!!");
				break;}
			Service c;
			c=new CarRental(car,days);
			boolean stateC=n.addService(c);
			if(stateC){
				System.out.println("\nService Added Successfully");
				System.out.print("\n-------------------------\n");}
			else {
				System.out.println("\nunable to add more services");
				System.out.print("\n-------------------------\n");}
			break;
			
			case 3:
				Service f;
				System.out.print("What day you want to book the flight(1-30)?: ");
			    int depart=user.nextInt();
			    if(depart<1||depart>30) {
					System.out.println("invalid entry, Specified date must be between 1-30 (days of the month)!!");
				break;}
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
				if(stateF){
					System.out.println("\nService Added Successfully");
					System.out.print("\n-------------------------\n");}
				else {
					System.out.println("\nunable to add more services");
					System.out.print("\n-------------------------\n");}
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
		int emailvalid=email.indexOf('@');
		while(emailvalid==-1) {
			System.out.println("Email must have an address '@'!");
			System.out.println("Enter your Email: ");
			email = user.next();
			user.nextLine();
			emailvalid=email.indexOf('@');
		}
			
		System.out.print("Password: ");
		pass = user.next();
		user.nextLine();
		int passwordLength=pass.length();
		boolean isPasswordValid= passwordValid(pass);

		while(passwordLength<8||!isPasswordValid) {
			System.out.println("Password length should be 8 characters or more>>\nPassword must contain a capital letter>>\nTry again!");
			System.out.println("Enter your Password: ");
			pass = user.next();
			user.nextLine();
			passwordLength=pass.length();
			isPasswordValid= passwordValid(pass);
		}

		User user1 = new User(name, email, pass, 3);
		String id;
		String password;
		System.out.println("\n==================================================\n");

		System.out.println("Login to your account");
		do {
			System.out.println("To exit the program, Enter x");
			System.out.println();
			System.out.print("Enter your name: ");
			id = user.nextLine();

			if (id.equalsIgnoreCase("x")) {
				System.out.print("Programe Teminated!! ");
				System.exit(0);
			}

			System.out.print("Enter Password: ");
			password = user.next();

		} while (!user1.login(id, password));

		System.out.println("\nLogin successful!");
		System.out.print("\n==================================================\n");
		int choice;

		do {
			System.out.println("What would you like to do>>?");
			System.out.print("-------------------------\n");
			System.out.println("1-Make booking");
			System.out.println("2-Cancel booking");
			System.out.println("3-Confirm booking");
			System.out.println("4-Modify booking");
			System.out.println("5-Show booking history");
			System.out.println("6-Log out!");
			System.out.println("-------------");
			System.out.print("Enter your choice: ");
			choice = user.nextInt();
			switch (choice) {
			case 1:
				Booking b = new Booking();
				AddServices(b);
				if (b.getNumberOfServices() > 0) {
					user1.makeBooking(b);
					System.out.print("\n=====================================\n");
					System.out.print(b.toString());
					
				}
				break;

			// cancel booking option :
			case 2:
				if (user1.getNob() == 0) {
					System.out.print("\nNo Bookings Available!!");
					System.out.print("\n=====================================\n");
					System.out.println();
					break;
				}

				System.out.print("Which booking you want to cancel? (1-2-3): ");
				int idBook = user.nextInt();
				boolean isCancelled=user1.cancelBooking(idBook); 
				if(isCancelled) {
					System.out.print("\nBooking cancelled");
					System.out.print("\n=====================================\n");
				}
				else {
					System.out.print("\nBooking not found!!");
					System.out.print("\n=====================================\n");}

				break;
			// confirm a booking(by default booking is not confirmed).
			case 3:
				if (user1.getNob() == 0) {
					System.out.println("\nNo Bookings Available!!");
					System.out.println();
					break;
				}

				System.out.print("Which booking you want to confirm? (1-2-3): ");
				int cBook = user.nextInt();
				boolean isConfirmed=user1.confirmBooking(cBook);
				if(isConfirmed) {
					System.out.print("\nBooking Confirmed successfully!");
					System.out.print("\n=====================================\n");}
				else {
					System.out.print("\nBooking Not found!");
					System.out.print("\n=====================================\n");}
				break;
			case 4:
				if (user1.getNob() == 0) {
					System.out.println("\nNo Bookings Available!!");
					System.out.println();
					break;
				}

				System.out.println("What you would like to do? ");
				System.out.print("-------------------------\n");
				System.out.println("1-delete booking ");
				System.out.println("2-Add service ");
				System.out.println("3-delete service ");
				int option = user.nextInt();
				switch (option) {
				case 1:
					System.out.println("Which booking you want to delete? (1-2-3): ");
					int dBook = user.nextInt();
					boolean bookingDeleted=user1.deleteBooking(dBook);
					if(bookingDeleted) {
						System.out.print("Booking deleted");
						System.out.print("\n=====================================\n");}
					else {
						System.out.print("Booking not found!!");
						System.out.print("\n=====================================\n");}

					break;
				case 2:
					System.out.println("Which booking you want to Add a service To? (1-2-3): ");
					int aService = user.nextInt();
					Booking v = user1.findBooking(aService);
					if (v != null)
						AddServices(v);
					else {
						System.out.print("Booking not found!! ");
						System.out.print("\n=====================================\n");}
					break;
				case 3:
					System.out.println("Which booking you want to delete a service from? (1-2-3): ");
					int dService = user.nextInt();
					Booking r = user1.findBooking(dService);
					if(r==null) {
						System.out.print("Booking not found!!");
						System.out.print("\n=====================================\n");
						break;}
					System.out.println("Which service you want to delete? (1-2-3): ");
					int serviceId = user.nextInt();
					boolean ServiceDeleted=r.DeleteService(serviceId);
					if(ServiceDeleted) {
						System.out.print("Service deleted");
						System.out.print("\n=====================================\n");}
					else {
						System.out.print("Service not found!");
						System.out.print("\n=====================================\n");}
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


