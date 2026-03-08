//Dina Alyabis - 446202768
public abstract class Service{

	private String serviceId;
	private String name ;
	private double price; 
	
	public Service() {//defaulte cons

		this.serviceId = "";
		this.name = "";
		this.price = "";
	}
	
	public Service( String serviceId , String name, double price) {//cons

		this.serviceId = serviceId;
		this.name = name;
		this.price = price;
	}
	
	public final String getDetails() {
		return" serviceId : " + serviceId + " , name : \ "+ name +  " , price :"+price;
	}
	
	public abstract double calculateCost();
	
	
public String getserviceId(){//getter
return serviceId ;
}// e 	
public String getname(){//getter
return name ;
}// e 	
public double getprice(){//getter
return price ;
}// e 

public void setserviceId(String serviceId) { // s setter
	this.serviceId = serviceId; 
}//e setter

public void setname(String name) { // s setter
	this.name = name; 
}//e setter

public void setprice(double price) { // s setter
	this.price = price; 
}//e setter
	
	
	
}
