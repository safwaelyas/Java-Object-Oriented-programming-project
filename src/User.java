
public class User {
private String userId;
private String name;
private String email;
private String password;
private int nOb;
private Booking[] bookList;


	public User(String id,String na,String Em,String pass,int size) {
		userId=id;
		name=na;
		email=Em;
		password=pass;
		nOb=0;
		bookList=new Booking[size];
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + "]";
	}

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
	public void login() {
		
	}
	public void logout() {
	}
	public void makeBooking() {
	}
	public void cancelBooking() {
	}
	

}
