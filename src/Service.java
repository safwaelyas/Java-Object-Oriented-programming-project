
public abstract class Service implements payable {
	
	// declaring variables
	protected int serviceId; // each service has its own iD 
	protected String serviceType; // the type might be hotel, flight,and car rental 
	protected double price; // the price of the service 

	public Service() {// defaulte constructor 
		this.serviceType = "";
		this.price =0.0;
	}

	public Service(String name) {// a constructor that receive a name of the service

		this.serviceType = name;
		this.price =0.0;
	}

	public final String getDetails() {// to show all the information of the service 
		return " serviceId : " + serviceId + " |||| serviceType : " + serviceType + "\n |price| :" + price;
	}

	public abstract double calculateCost();// an abstract method that will be used in the sup classes 

	public int getserviceId() {// getter
		return serviceId;
	}

	public String getname() {// getter
		return serviceType;
	}

	public void setserviceId(int serviceId) { // setter
		this.serviceId = serviceId;
	}

	public void setPrice(double amount) {//setter
		price=amount;
	}
	public double getPrice() {//getter
		return price;
	}
	public void setServiceType(String s) {//setter
		serviceType=s;
	}
}//end class
