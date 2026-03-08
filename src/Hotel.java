//Dina Alyabis - 446202768 Doneee
public class Hotel extends Service {

private char roomType ;
private int nights;

	public Hotel() {//defaulte cons
		super("Hotel");
		roomType = '';
		nights = 0;
	}
	
	public Hotel (char roomType,int nights) {// cons
		super("Hotel");
		this.roomType= roomType;
		this.nights=nights;
	}
	
	public double calculateCost() {
		if(roomType=='s'||roomType=='S')
			return (double)(nights * 1250);
			else
			return (double)(nights * 250);
	}
	public Hotel( Hotel obj) {
		super("Hotel");
		roomType = obj.roomType;
		nights = obj.nights;
	}


public int getnights(){//s getter
	return nights;
}// e getter


public void setnights(int nights) { // s setter
	this.nights = nights; 
}//e setter

public String toString(){
return super.getDetails() +" \n , roomType : " + roomType + " , nights : \ "+ nights ;
}

}//end class 
