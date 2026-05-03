package model;
import java.io.Serializable;
import java.time.LocalDate;

import core.payable;
public class Booking implements payable, Serializable {
	//declaring variables
	private final double CarTax=500;//Tax added in case of choosing a car rental service.
	public static int counter=1;//counter placed in the Booking ID.
	private int bookingId;//For each Booking,so the user chooses the service based on the ID
	private LocalDate date;//a class represents the actual date when the user add a Booking to his array.
	private String status;//the state of the Booking if it not\COnfirmed or Canceled
	private double totalPrice ;//THE total price of the services in each Booking.
	public Service[] servBooked ;//Array have a size of three services objects to install in each Booking
	public int nOs;


	//default constructor.
		public Booking() {
	bookingId=counter++;
	LocalDate today = LocalDate.now();
	date=today;
	status="Not confirmed";
	totalPrice=0.0;
	servBooked=new Service[3];
	nOs = 0;
		}
		
		public boolean addService(Service s) {//a method to add a service in the Array by it`s type and calculating it`s price return false if the Array is fall.
			if(nOs<servBooked.length) {
				Service serviceToAdd=null;//used a coped version of the object"becuse of the Composition relation between the tow clases".
				if(s instanceof Hotel) 
					serviceToAdd=new Hotel((Hotel)s);
					else if(s instanceof internationalFlights) {
						serviceToAdd=new internationalFlights((internationalFlights)s);
						serviceToAdd.setServiceType("International Flight");
					}
				else if(s instanceof CarRental)
					serviceToAdd=new CarRental((CarRental)s);
				else if(s instanceof Flight)
					serviceToAdd=new Flight((Flight)s);
				serviceToAdd.setserviceId(nOs+1);
				servBooked[nOs++]=serviceToAdd;
				serviceToAdd.setPrice(serviceToAdd.calculateCost());
				updateTotalPrice();
			return true;
			}
			return false;	
		}
	
		//Abstract Method
		public double calculateCost() {//A method return the price of the car rental object after adding the  car tax  if it there is a car rental object in the Booking.
			boolean CarFound=false;
			for(int i=0;i<nOs;i++) {
				if(servBooked[i].getname().equalsIgnoreCase("car"))
					CarFound=true;}
			if(CarFound) 
			return calculatePrice(0)+CarTax;
			else
				return calculatePrice(0);
		}
		
		public double calculatePrice(int index) {//recursive method to calculate the total price of the services in each Booking.
		    // base case
		    if(index == nOs)
		        return 0;

		    // recursive case
		    return servBooked[index].calculateCost() + calculatePrice(index + 1);

		}
		
		private void updateTotalPrice() {
		    totalPrice = calculateCost();
		}
		
	
		
		public boolean DeleteService(int id) {//deleting the service in the array by shifting.
			for(int i=0;i<nOs;i++) {
				if(servBooked[i].getserviceId()==id) {
					for(int j=i;j<nOs-1;j++)
						servBooked[j]=servBooked[j+1];
				servBooked[--nOs]=null;
				for(int k=0;k<nOs;k++) //updating the ID of the services in the array.
	                servBooked[k].setserviceId(k+1);
				updateTotalPrice();
						return true;}
					}
			return false;
			}
			

		public void setStatus(String status) {//setter for the state of the book.
			this.status = status;
		}

	public int getBookingId() {//getter for the ID of the book.
			return bookingId;
		}

		public int getNumberOfServices() {//getter of number of services in each Book
			return nOs;
		}
		public String toString() {//method to print booking details and the details of each service.
			String s="";
			for(int i=0;i<nOs;i++)
				s+= servBooked[i].toString()+"\n------------------------\n";
			return "Booking details:\n---------------\nBooking ID: "+bookingId+"\nDate: "+date+"\nStatus OF Booking: "+status+"\nNumber of Services: "+nOs+"\n-------------------\n"+s+"\nBooking Total price: "+calculateCost()+" \"Car Tax Included\"\n";}
		
		
		public double getTotalPrice() {//getter of the total price.
			return totalPrice;
		}
		
}

			