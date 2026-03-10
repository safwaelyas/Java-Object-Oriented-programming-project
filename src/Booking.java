import java.time.LocalDate;
public class Booking implements payable {
	//Attributes
	private final double CarTax=500;
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
	totalPrice=calculateCost();
	servBooked=new Service[3];
	nOs = 0;
		}
		
		public boolean addService(Service s) {
			if(nOs<servBooked.length) {
				Service serviceToAdd=null;
				if(s instanceof Hotel) 
					serviceToAdd=new Hotel((Hotel)s);
					else if(s instanceof Flight)
						serviceToAdd=new Flight((Flight)s);
				else if(s instanceof CarRental)
					serviceToAdd=new CarRental((CarRental)s);
				else if(s instanceof internationalFlights)
					serviceToAdd=new internationalFlights((internationalFlights)s);
				serviceToAdd.setserviceId(nOs+1);
				servBooked[nOs++]=serviceToAdd;
				System.out.print("Service Added Successfully\n");
			return true;
			}
			return false;	
		}
	
		
		public double calculateCost() {
			boolean CarFound=false;
			for(int i=0;i<nOs;i++) {
				if(servBooked[i].getname().equalsIgnoreCase("car"))
					CarFound=true;}
			if(CarFound)
			return calculatePrice(0)+CarTax;
			else
				return calculatePrice(0);
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
				s+= servBooked[i].getserviceId()+"-"+servBooked[i].getname()+"\n";
			return "Booking details:\nBooking ID: "+bookingId+"\nDate: "+date+"\nStatus OF Booking:"+status+"\nNumber of Services: "+nOs+""+s+"\nTotal price: "+calculateCost()+"\n";}
		
		
		
		
}

			