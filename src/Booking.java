public class Booking {
	//Attributes
	private String bookingId;
	private String date;
	private String status;
	private double totalPrice ;
	public Service[] servBooked ;
	public int nOs;


	//Constructors
		public Booking(String b,String d,String s,int size) {
	bookingId=b;
	date=d;
	status=s;
	totalPrice=0;
	servBooked=new Service[size];
	nOs = 0;
		}
	//gitters and setters
	public double getTotalPrice() {
			return totalPrice;
		}

	public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

	public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

	public String getBookingId() {
			return bookingId;
		}

		public void setBookingId(String bookingId) {
			this.bookingId = bookingId;
		}
	//methods
		public void confirmBooking() {
			
		}
		public void cancelBooking () {
			
		}
		public double calculatePrice() {
			return totalPrice ;
			
		}
		public String toString() {
			return "Booking details:\nBooking ID: "+bookingId+"\nDate: "+date+"\nStatus OF Booking:"+status;
		}
		
	}