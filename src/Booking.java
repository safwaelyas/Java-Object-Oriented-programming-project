import java.time.LocalDate;
public class Booking {
	//Attributes
	public static int counter=1;
	private int bookingId;
	private String date;
	private String status;
	private double totalPrice ;
	public Service[] servBooked ;
	public int nOs;


	//Constructors
		public Booking() {
	bookingId=counter++;
	LocalDate today = LocalDate.now();
	date=today;
	status="Not confirmed";
	totalPrice=0;
	servBooked=new Service[3];
	nOs = 0;
		}
		
		public boolean addService(Service s) {
			if(nOs<servBooked.length) {
				if(s instanceof Hotel)
					servBooked[nOs++]=new Hotel((Hotel)s);
				else if(s instanceof Flight)
					servBooked[nOs++]=new Flight((Flight)s);
				else if(s instanceof CarRental)
					servBooked[nOs++]=new CarRental((CarRental)s);
				else if(s instanceof internationalFlights)
					servBooked[nOs++]=new internationalFlights((internationalFlights)s);

			return true;
			}
			return false;	
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

	public int getBookingId() {
			return bookingId;
		}

		
		public void confirmBooking() {
			
		}
		public void cancelBooking () {
			
		}
		public double calculatePrice() {
			return totalPrice ;
			
		}
		public int getNumberOfServices() {
			return nOs;}
		}
		public String toString() {
			return "Booking details:\nBooking ID: "+bookingId+"\nDate: "+date+"\nStatus OF Booking:"+status;
		}
		
	}