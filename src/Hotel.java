
public class Hotel extends Service {

private char roomType ;
private int nights;

	public Hotel() {//defaulte cons
		super("Hotel");
		roomType ='0';
		nights = 0;
	}
	
	public Hotel (char roomType,int nights) {// cons
		super("Hotel");
		this.roomType= roomType;
		this.nights=nights;
	}
	
	public double calculateCost() {
		if(roomType=='S')
			return (double)(nights * 1250);
			else
			return (double)(nights * 250);
	}
	public Hotel( Hotel obj) {
		super("Hotel");
		roomType = obj.roomType;
		nights = obj.nights;
	}


public String toString(){
return super.getDetails() +" \n , roomType : " + roomType + " , nights :  "+ nights ;
}

}//end class 
