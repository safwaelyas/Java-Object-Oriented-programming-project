//Dina Alyabis - 446202768 Doneee
public class Hotel extends Service {

private String roomType ;
private int nights;

	public Hotel() {//defaulte cons
		super("","",0);
		roomType = "";
		nights = 0;
	}
	
	public Hotel(String serviceId , String name, double price,String roomType,int nights) {// cons
		super(serviceId,name,price);
		this.roomType= roomType;
		this.nights=nights;
	}
	
	public double calculateCost() {
		if(roomType.equals("Suite"))
			return (double)(nights * 1250);
			else
			return (double)(nights * 250);
	}
	
public String getroomType(){//getter
return roomType ;
}// e 

public int getnights(){//s getter
	return nights;
}// e getter

public void setroomType(String roomType) { // s setter
	this.roomType = roomType; 
}//e setter

public void setnights(int nights) { // s setter
	this.nights = nights; 
}//e setter

public String toString(){
return super.getDetails() +" \n , roomType : " + roomType + " , nights : \ "+ nights ;
}

}//end class 
