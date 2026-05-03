/* Students information:
1- ARWA SAADAN ABDULLAH AL-SAADAN./ ID: 446201958.
2- SAFWA MOHAMEDAHMED ELYAS ABDALLA./ ID:446207694.
3- Dina Ibrahim Alyabis./ ID:446202768.

SECTION NUMBER:46412
Lab INUSTRUCTUR: Ghada Abdullah S Alamer.
*/
//Class with the main method implemented.
package core;

import static java.lang.Character.isUpperCase;
import static java.lang.Character.toUpperCase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import model.Booking;
import model.CarRental;
import model.Flight;
import model.Hotel;
import model.Service;
import model.User;
import model.internationalFlights;
import ui.SingInFrame;

public class BookWithUs {
	static Scanner user= new Scanner(System.in);
	
	public static User[] users=new User[100];
	public static int count=loadUsers(users);
	
	
	public static void clearUsersFile() {
    try {
        new FileOutputStream("users.dat").close();
    } catch (Exception e) {
        System.out.println("Could not clear file.");
    }
}   
	
 public static int loadUsers(User[] users){
int count=0;
try{
ObjectInputStream ois = new ObjectInputStream(new FileInputStream("users.dat"));
count=ois.readInt();
for(int i=0;i<count;i++) 
users[i]=(User) ois.readObject();
ois.close();
}
catch (FileNotFoundException e) {
    System.out.println("File not found, starting with empty users.");
}
catch (IOException e) {
    System.out.println("Error reading file.");
    e.printStackTrace();
}
catch (ClassNotFoundException e) {
    System.out.println("User class not found.");
}
return count;
 }

 
 public static void saveUsers(){
try{
 ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("users.dat"));
 oos.writeInt(count);
 for(int i=0;i<count;i++) 
 oos.writeObject(users[i]);
 oos.close();
}

catch(Exception e) {
	System.out.println("Error saving users!!");
}
 }

 
 
 public static User login(String name,String pass){
	 User tryUser=null;
	 for (int i = 0; i < count; i++) {
		 tryUser= users[i];
	        if (tryUser.getName().equals(name) && tryUser.login(pass)) {
	            return tryUser;
	        }
	    }
	    return null;
 }
 

 
 public static int signUp(String N,String E,String P){
 if(count==users.length){
 return -1;}
 users[count++]=new User(N,E,P,3);
 saveUsers();
  return count;
		}
 
 
	public static boolean passwordValid(String pass) {
		char c;
		for(int l=0;l<pass.length();l++) {
			c=pass.charAt(l);
			if(isUpperCase(c))
				return true;}
		return false;
	}
	
	
	public static boolean CancelBooking(int n,User u){
		boolean isCancelled=u.cancelBooking(n); 
		if(isCancelled) {
			saveUsers();
			return true;
		}
		else {
		return false;
		}
		}
	public static boolean ConfirmBooking(int n,User u){
		boolean isConfirmed=u.confirmBooking(n);
		if(isConfirmed) {
			saveUsers();
			return true;
		}
		else {
		return false;
		}
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
					//System.out.print(n.servBooked[n.nOs-1].getPrice());
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
					//System.out.print(n.servBooked[n.nOs-1].getPrice());
					System.out.print("\n-------------------------\n");}
				else {
					System.out.println("\nunable to add more services");
					System.out.print("\n-------------------------\n");}
				break;
			default: break; }	
		}while(serv!=4);
		
		return n;
		
	}
	
	
	public static void main(String[] args)throws IOException {
		clearUsersFile();
		//User[] users=new User[100];
		//int count=loadUsers(users);
		//User currentUser=null;
		
		SingInFrame frame1 = new SingInFrame();
		frame1.setVisible(true);
		
		
//		int choice;
//
//		do {
//			System.out.println("What would you like to do>>?");
//			System.out.print("-------------------------\n");
//			System.out.println("1-Make booking");
//			System.out.println("2-Cancel booking");
//			System.out.println("3-Confirm booking");
//			System.out.println("4-Modify booking");
//			System.out.println("5-Show booking history");
//			System.out.println("6-Log out!");
//			System.out.println("-------------");
//			System.out.print("Enter your choice: ");
//			choice = user.nextInt();
//			switch (choice) {
//			case 1:
//				Booking b = new Booking();
//				AddServices(b);
//				if (b.getNumberOfServices() > 0) {
//					currentUser.makeBooking(b);
//					saveUsers(users,count);
//					System.out.print("\n=====================================\n");
//					System.out.print(b.toString());
//					
//				}
//				break;
//
//			// cancel booking option :
//			case 2:
//				
//			// confirm a booking(by default booking is not confirmed).
//			case 3:
//				
//			case 4:
//				if (currentUser.getNob() == 0) {
//					System.out.println("\nNo Bookings Available!!");
//					System.out.println();
//					break;
//				}
//
//				System.out.println("What you would like to do? ");
//				System.out.print("-------------------------\n");
//				System.out.println("1-delete booking ");
//				System.out.println("2-Add service ");
//				System.out.println("3-delete service ");
//				int option = user.nextInt();
//				switch (option) {
//				case 1:
//					System.out.println("Which booking you want to delete? (1-2-3): ");
//					int dBook = user.nextInt();
//					boolean bookingDeleted=currentUser.deleteBooking(dBook);
//					if(bookingDeleted) {
//						System.out.print("Booking deleted");
//						saveUsers(users,count);
//						System.out.print("\n=====================================\n");}
//					else {
//						System.out.print("Booking not found!!");
//						System.out.print("\n=====================================\n");}
//
//					break;
//				case 2:
//					System.out.println("Which booking you want to Add a service To? (1-2-3): ");
//					int aService = user.nextInt();
//					Booking v = currentUser.findBooking(aService);
//					if (v != null){
//						AddServices(v);
//						saveUsers(users,count);}
//					else {
//						System.out.print("Booking not found!! ");
//						System.out.print("\n=====================================\n");}
//					break;
//				case 3:
//					System.out.println("Which booking you want to delete a service from? (1-2-3): ");
//					int dService = user.nextInt();
//					Booking r = currentUser.findBooking(dService);
//					if(r==null) {
//						System.out.print("Booking not found!!");
//						System.out.print("\n=====================================\n");
//						break;}
//					System.out.println("Which service you want to delete? (1-2-3): ");
//					int serviceId = user.nextInt();
//					boolean ServiceDeleted=r.DeleteService(serviceId);
//					if(ServiceDeleted) {
//						System.out.print("Service deleted");
//						saveUsers(users,count);
//						System.out.print("\n=====================================\n");}
//					else {
//						System.out.print("Service not found!");
//						System.out.print("\n=====================================\n");}
//					break;
//				default:
//					System.out.println("invalid selection!!");
//					break;
//				}
//				break;
//
//			case 5:
//				if (currentUser.getNob() == 0) {
//					System.out.println("No bookings found!!");
//					System.out.println();
//					break;
//				}
//
//				Booking[] array = currentUser.getBookList();
//				for (int i = 0; i < currentUser.getNob(); i++) {
//					System.out.println(array[i].toString());
//				}
//
//				break;
//			case 6:
//				currentUser.logout();
//				return;
//			default:
//				System.out.println("Invalid entry!! ");
//				break;
//			}
//
//		} while (choice >= 1 && choice < 6);

	}

	}