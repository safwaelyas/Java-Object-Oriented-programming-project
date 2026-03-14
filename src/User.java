import java.util.UUID;

public class User {
	// attribuites section.
	private String userId;
	private String name;
	private String email;
	private String password;
	private int nOb;
	private Booking[] bookList;

//constructor to initiate the values of the attribuites.
	public User(String na, String Em, String pass, int size) {
		userId = UUID.randomUUID().toString();
		name = na;
		email = Em;
		password = pass;
		nOb = 0;
		bookList = new Booking[size];
	}

	public String toString() {
		return  "User ID: " + userId + "\nName: " + name + "\nEmail: " + email;
	}

	// login method that validate User Id and Password to allow to enter the
	// personal booking system account.
	public boolean login(String name, String password) {

		if (!this.name.equals(name)) {

			System.out.println("Login failed, ID is incorrect!, Try again!");
			return false;
		}

		if (!this.password.equals(password)) {
			System.out.println("Login failed, Password is incorrect!,Try again!");
			return false;
		}

		return true;
	}

//system logout method.(doesn't check for anything.)
	public void logout() {
		System.out
				.println("Thank you for using \"Book with us\", we hope our service was satisfying. Have a nice day!");
	}

	// method to add a booking to the user array of bookings incase he didn't reach
	// bookings limit.
	public boolean makeBooking(Booking book) {
		if (nOb < bookList.length) {
			bookList[nOb++] = book;
			return true;
		}
		return false;
	}

	// a method to cancel a booking with the recevied ID.
	public boolean cancelBooking(int id) {
		for (int i = 0; i < nOb; i++) {
			if (bookList[i].getBookingId() == id) {
				bookList[i].setStatus("Booking cancelled");
				return true;
			}
		}
		return false;
	}

	public boolean deleteBooking(int id) {
		for (int i = 0; i < nOb; i++) {
			if (bookList[i].getBookingId() == id) {
				for (int j = i; j < nOb - 1; j++)
					bookList[j] = bookList[j + 1];
				bookList[--nOb] = null;
				return true;
			}
		}
		return false;

	}

	public boolean confirmBooking(int id) {
		for (int i = 0; i < nOb; i++) {
			if (bookList[i].getBookingId() == id) {
				bookList[i].setStatus("Confirmed");
				return true;
			}
		}
		return false;

	}

	public Booking findBooking(int id) {
		for (int i = 0; i < nOb; i++) {
			if (bookList[i].getBookingId() == id)
				return bookList[i];
		}
		return null;
	}

	public Booking[] getBookList() {
		return bookList;
	}

	public int getNob() {
		return nOb;
	}
	// getters and setters for the attributes.

	public String getUserId() {
		return userId;
	}


	public String getName() {
		return name;
	}

	

	

	
}
