//Dina Alyabis - 446202768
public abstract class Service implements payable {
	
	protected int serviceId;
	protected String serviceType;
	protected double price;

	public Service() {// defaulte cons
		this.serviceType = "";
		this.price = calculateCost();
	}

	public Service(String name) {// cons

		this.serviceType = name;
		this.price = calculateCost();
	}

	public final String getDetails() {
		return " serviceId : " + serviceId + " ,serviceType : " + serviceType + " , price :" + price;
	}

	public abstract double calculateCost();

	public int getserviceId() {// getter
		return serviceId;
	}// e

	public String getname() {// getter
		return serviceType;
	}// e

	public void setserviceId(int serviceId) { // s setter
		this.serviceId = serviceId;
	}// e setter

	

	

}
