package model;
public class Hotel extends Service {

	// declaring variables
	private char roomType; // the type might be suite or regular room
	private int nights; // the number of nights

	public Hotel() {// defaulte constructor
		super("Hotel");
		roomType = '0';
		nights = 0;
	}

	public Hotel(char roomType, int nights) {// a constructor that receive the room type and the number of nights
		super("Hotel");
	   this.roomType = roomType;
	 this.nights = nights;
	}

	public double calculateCost() {// a method that will calculate the cost depending on the room type if it’s
									// suite or regular
		if (roomType == 'S')
			return (double) (nights * 1250);
		else
			return (double) (nights * 250);
	}

	public Hotel(Hotel obj) {// a copy constructor that will copy the information of another object
		super("Hotel");
		roomType = obj.roomType;
		nights = obj.nights;
	}

	public String toString() {// to show all the information of the hotel service
		return super.getDetails() + " \n |roomType| : " + roomType + "\n |nights| :  " + nights;
	}

}// end class
