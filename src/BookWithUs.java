/* Students information:
1- ARWA SAADAN ABDULLAH AL-SAADAN./ ID: 446201958.
2- SAFWA MOHAMEDAHMED ELYAS ABDALLA./ ID:446207694.
3- Dina Ibrahim Alyabis./ ID:446202768.

SECTION NUMBER:46412
Lab INUSTRUCTUR: Ghada Abdullah S Alamer.
*/

//Class with the main method implemented.
import java.util.*;
import static java.lang.Character.*;
import static java.lang.Math.*;
public class BookWithUs {

	public static void main(String[] args) {
		Scanner user= new Scanner(System.in);
		String name,email,pass;
		System.out.println("Welcome to Book with us System");
        System.out.println("Enter your information below to sign up!");
        System.out.print("Name: ");
        name=user.nextLine();
        System.out.print("Email: ");
        email=user.next();
        user.nextLine();
        System.out.print("Password: ");
        pass=user.next();
        user.nextLine();
       User user1=new User(name,email,pass,3);
		do {
			System.out.println("What would you like to do?");
			System.out.println("1-Make a book");
			System.out.println("2-Cancel booking");
			System.out.println("3-Confirm booking");
			System.out.println("4- Modify booking");
			System.out.println("5- Show booking");
			System.out.println("6-Log out!");
			System.out.println("Enter you choice: ");
			int choice=nextInt();
			if(choice==6) {
				System.out.println("Good bye, Have a nice day");
				break;}
			switch(choice) {
			case 1:
				Booking b=new Booking();
			do {
				System.out.println("choose services to add to your booking: ");
				System.out.println("1- Book Hotel");
				System.out.println("2- Rent a Car");
				System.out.println("3-Book a Flight");
				System.out.println("4-Back to the main menu!");
				int serv=nextInt();
				switch(serv) {
				case 1:
					System.out.print("Which room type would you like to choose? (Suite: s, regular: r): ");
					char room=user.next().charAt(0);
					System.out.print("How many nights you want to stay?:  ");
					int night=nextInt();
					Service s;
					s=new Hotel(room,night);
					boolean state=b.addService(s);
					if(!state)
						System.out.println("unable to add more services")
					break;
				case 2: 
					System.out.print("Which Car type would you like to choose? (Luxury: L, regular: r): ");
					char car=user.next().charAt(0);
				    System.out.print("How many Days to rent the car?:  ");
				    int days=user.nextInt();
				Service s;
				s=new CarRental(car,days);
				b.addService(s); 
				boolean state=b.addService(s);
				if(!state)
					System.out.println("unable to add more services")
				break;
				
				case 3:
					Service s;
					System.out.print("What day you want to book the flight(1-30)?: ")
				    int depart=user.nextInt();
					System.out.print("What Class you want to book?(First class[F],Bussiness[B],Economy[E]): ")
					char classtype=user.next().charAt(0);
					System.out.print("is your flight international? (yes, no): ");
					String flight=user.next();
					if(flight.equalsIgnoreCase("Yes")) {
						System.out.print("Do you have a valid Visa? (yes, no):");
						String VisaFound=user.next();
						if(VisaFound.equalsIgnoreCase("Yes")) 
						s=new internationalFlights(depart,classtype,true);
						else s=new internationalFlights(depart,classtype,false);	
					}
					else 
					s=new Flight(depart,classtype);
					b.addService(s); 
					boolean state=b.addService(s);
					if(!state)
						System.out.println("unable to add more services")
					break;
				default: break;	
			}while(serv!=4);
			user1.makeBooking(b);
			break;
			
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 6: break;
			default: System.out.println("Invalid entry!! ");
 break;
			}


		}while(choice>=1&&choice<6);
		
		
			
		}

	}

}
