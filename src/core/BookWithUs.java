/* Students information:
1- ARWA SAADAN ABDULLAH AL-SAADAN./ ID: 446201958.
2- SAFWA MOHAMEDAHMED ELYAS ABDALLA./ ID:446207694.
3- Dina Ibrahim Alyabis./ ID:446202768.

SECTION NUMBER:46412
Lab INUSTRUCTUR: Ghada Abdullah S Alamer.
*/
//Class with the main method implemented.
package core;

import static java.lang.Character.*;
import java.io.*;
import java.util.Scanner;

import model.*;
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
		else 
		return false;
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
	public static boolean DeleteBooking(int n,User u){
		boolean bookingDeleted=u.deleteBooking(n);
		if(bookingDeleted) {
			saveUsers();
			return true;
		}
		else {
		return false;
		}
		}
	
	public static boolean makeBookUser(User u,Booking b) {
		if(b.getNumberOfServices()>0) {
			u.makeBooking(b);
			saveUsers();
		       return true; }
		else
			return false;
	}
	
	
	//jkhgfgfhjklA25
	public static void main(String[] args)throws IOException {
		//clearUsersFile();
		//User[] users=new User[100];
		//int count=loadUsers(users);
		//User currentUser=null;
		
		SingInFrame frame1 = new SingInFrame();
		frame1.setVisible(true);
		

	}

	}