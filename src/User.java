
public class User {
	//attribuites section.
private String userId;
private String name;
private String email;
private String password;
private int nOb;
private Booking[] bookList;

//constructor to initiate the values of the attribuites.
	public User(String id,String na,String Em,String pass,int size) {
		userId=id;
		name=na;
		email=Em;
		password=pass;
		nOb=0;
		bookList=new Booking[size];
	}

	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + "]";
	}

	//login method that validate User Id and Password to allow to enter the personal booking system account.
	public boolean login(String userId,String password) {
		if(this.userId!=userId) {
			System.out.println("ID is incorrect!")
			return false;}
		else if (this.password!=password) {
			System.out.println("Password is incorrect is incorrect!")
			return false;}
		return true;
		}
			
		
	}
//system logout method.(doesn't check for anything.)
	public void logout() {
			System.out .print(ln("Thank you for using \"Book with us\", we hope our service was satisfying. Have a nice day!"));
	}
	//method to add a booking to the user array of bookings incase he didn't reach bookings limit.
	public boolean makeBooking(Booking book) {
		if(nOb<bookList.length) {
			bookList[nOb++]=book;
		return true;}
		return false;
	}
	//a method to cancell a booking with the recevied ID.
	public boolean cancelBooking(Booking book) {
		for(int i=0;i<nOb-1;i++) {
			if(bookList[i].getId()==book.getId()) {
				for(int j=i;j<nOb-1;j++)
				bookList[j]==bookList[j+1];
				bookList[--nOb]=null;
				return true;}
		}
		return false;
	}
	
	//getters and setters for the attributes.
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
