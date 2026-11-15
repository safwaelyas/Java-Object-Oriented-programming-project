// Book With Us - course project

package core;

import static java.lang.Character.isUpperCase;

import java.io.*;
import java.util.Scanner;
import model.Booking;
import model.User;
import ui.SingInFrame;

public class BookWithUs {

    static Scanner user = new Scanner(System.in);
    public static SinglyLinkedList users = new SinglyLinkedList();

    static {
    	try {
        loadUsers();
    	}
    	catch(IOException e) {
    		  e.printStackTrace();
    	}
    }
//method to empty the file data.
    public static void clearUsersFile() {
        try {
            new FileOutputStream("users.dat").close();
        } catch (Exception e) {
            System.out.println("Could not clear file.");
        }
    }
//method to lad the users at the beginning of the program
    public static void loadUsers()throws IOException {
    	 ObjectInputStream ois = null;
        try {
        	File usersFile=new File("users.dat");
        	if(!usersFile.exists()||usersFile.length()==0)
        		return;
           ois = new ObjectInputStream(new FileInputStream(usersFile));
            while(true) {
            	User u=(User) ois.readObject();
                users.addLast(u);
            }
   
        }catch (EOFException e2) {
            e2.printStackTrace();
            
            }

       catch (ClassNotFoundException e3) {
            System.out.println("User class not found.");
        }
        finally{
        	 if (ois != null)
                 ois.close();
        }
    }
    //method that save updated users data in the file

    public static void saveUsers() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("users.dat"));
            SinglyLinkedList.UserNode current = users.getHead();
            while (current != null) {
                oos.writeObject(current.getData());
                current = current.getNext();
            }
            oos.close();
        } catch (IOException e) {
           e.printStackTrace();
        }
    }

    public static User login(String name, String pass) {
        SinglyLinkedList.UserNode current = users.getHead();
        while (current != null) {
            User tryUser = current.getData();
            if (tryUser.getName().equals(name) && tryUser.login(pass))
                return tryUser;
            current = current.getNext();
        }
        return null;
    }

    public static int signUp(String N, String E, String P) {
        users.addLast(new User(N, E, P, 3));
        saveUsers();
        return users.getSize();
    }

    public static boolean passwordValid(String pass) {
        char c;
        for (int l = 0; l < pass.length(); l++) {
            c = pass.charAt(l);
            if (isUpperCase(c)) return true;
        }
        return false;
    }

    
    //helper methods for frames button actions 
   //method cancel booking
    public static boolean CancelBooking(int n, User u) {
        boolean isCancelled = u.cancelBooking(n);
        if (isCancelled) {
            saveUsers();
            return true;
        } else {
            return false;
        }
    }
    //method confirm booking

    public static boolean ConfirmBooking(int n, User u) {
        boolean isConfirmed = u.confirmBooking(n);
        if (isConfirmed) {
            saveUsers();
            return true;
        } else {
            return false;
        }
    }
    
    //method delete booking

    public static boolean DeleteBooking(int n, User u) {
        boolean bookingDeleted = u.deleteBooking(n);
        if (bookingDeleted) {
            saveUsers();
            return true;
        } else {
            return false;
        }
    }
    
    //method make booking

	public static boolean makeBookUser(User u,Booking b) {
		if(b.getNumberOfServices()>0) {
			u.makeBooking(b);
			saveUsers();
		       return true; }
		else
			return false;
	}

	
	public static void main(String[] args)throws IOException {
		//clearUsersFile();	
		
		//initiates the programe at the sign in frame.....
		SingInFrame frame1 = new SingInFrame();
		frame1.setVisible(true);
		

	}

	}