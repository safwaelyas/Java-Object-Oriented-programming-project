import java.time.LocalDate;
public class Booking {
	//Attributes
	public static int counter=1;
	private int bookingId;
	private LocalDate date;
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
	totalPrice=calculatePrice(0);
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
				System.out.print("Service Added Successfully\n");
			return true;
			}
			return false;	
		}
		
		public double calculatePrice(int index) {
		    // base case
		    if(index == nOs)
		        return 0;

		    // recursive case
		    return servBooked[index].calculateCost() + calculatePrice(index + 1);
		}
		
		
		public boolean DeleteService(int id) {
			for(int i=0;i<nOs;i++) {
				if(servBooked[i].getserviceId()==id) {
					for(int j=i;j<nOs-1;j++)
						servBooked[j]=servBooked[j+1];
				servBooked[--nOs]=null;
						System.out.print("Service deleted");
						return true;}
					}
			System.out.print("Service not found!");
			return false;
			}
			
				
		
	//gitters and setters
	public double getTotalPrice() {
			return totalPrice;
		}

		public void setStatus(String status) {
			this.status = status;
		}

	public int getBookingId() {
			return bookingId;
		}

		public int getNumberOfServices() {
			return nOs;
		}
		public String toString() {
			String s="";
			for(int i=0;i<nOs;i++)
				s= servBooked[i].getserviceId()+"-"+servBooked[i].getname()+"\n";
			return "Booking details:\nBooking ID: "+bookingId+"\nDate: "+date+"\nStatus OF Booking:"+status+"\nNumber of Services: "+nOs+""+s+"\nTotal price: "+calculatePrice(0)+"\n---------------------------------";
		}
		
	}