//Dina Alyabis - 446202768
public abstract class Service implements payable{
public static int count=1;
	private int serviceId;
	private String serviceType ;
	private double price; 
	
	public Service() {//defaulte cons

		this.serviceId =count++ ;
		this.serviceType = "";
		this.price = 0.0;
	}
	
	public Service(String name) {//cons

		this.serviceId =count++;
		this.serviceType = name;
		this.price = 0.0;
	}
	
	public final String getDetails() {
		return" serviceId : " + serviceId + " , name : \ "+ name +  " , price :"+price;
	}
	
	public abstract double calculateCost();
	
	
public String getserviceId(){//getter
return serviceId ;
}// e 	
public String getname(){//getter
return serviceType ;
}// e 	
public double getprice(){//getter
return price ;
}// e 

public void setserviceId(String serviceId) { // s setter
	this.serviceId = serviceId; 
}//e setter

public void setname(String name) { // s setter
	this.serviceType = name; 
}//e setter

public void setprice() { // s setter
	this.price = calculateCost(); 
}//e setter
	
	
	
}
