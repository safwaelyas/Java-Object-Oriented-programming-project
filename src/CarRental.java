
public class CarRental extends Service {

	// declaring variables
	private char carType; // the type might be luxurious or regular car
	private int rentalDays; // the number of rental days

	public CarRental() {// defaulte constructor
		super("Car");
		carType = '0';
		rentalDays = 0;
	}

	public CarRental(char carType, int rentalDays) {// a constructor that receive the car type and rental days
		super("Car");
		this.carType = carType;
		this.rentalDays = rentalDays;
	}

	public double calculateCost() {// a method that will calculate the cost depending on the car type if it’s
									// luxurious or regular
		if (carType == 'L')
			return (double) (rentalDays * 1000);
		else
			return (double) (rentalDays * 100);
	}

	public CarRental(CarRental obj) {// a copy constructor that will copy the information of another object
		super("Car");
		carType = obj.carType;
		rentalDays = obj.rentalDays;
	}

	public String toString() {// to show all the information of the car rental service
		return super.getDetails() + " \n , carType : " + carType + "\n , rentalDays :  " + rentalDays;
	}

}// end class
