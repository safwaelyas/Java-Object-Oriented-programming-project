//Dina Alyabis - 446202768 Donne
public class CarRental extends Service {
private String carType ;
private int rentalDays ;

	public CarRental() {
		super("","",0);
		carType ="";
		rentalDays= 0;
	}
	public CarRental(String serviceId , String name, double price,String carType,int rentalDays) {
		super(serviceId,name,price);
		this.carType=carType;
		this.rentalDays = rentalDays;
	}
	public double calculateCost() {
		
	}
	
public String getcarType(){//getter
return carType ;
}// e 

public int getrentalDays(){//s getter
	return rentalDays;
}// e getter

public void setcarType(String carType) { // s setter
	this.carType = carType; 
}//e setter

public void setrentalDays(int rentalDays) { // s setter
	this.rentalDays = rentalDays; 
}//e setter	
	

public String toString(){
return super.toString() +" \n , carType : " + carType + " , rentalDays : \ "+ rentalDays ;
}

	
}
