
public class Flight extends Service {

	// declaring variables
	protected int departure;// departure time
	protected char ClassType; // the type might be first or business or economy class

	public Flight() {// defaulte constructor
		super("Flight");
		this.departure = 1;
		this.ClassType = '0';
	}

	public Flight(int departure, char ClassType) {// a constructor that receive the class type and the departure time
		super("Flight");
		this.departure = departure;
		this.ClassType = ClassType;

	}

	public double calculateCost() {// a method that will calculate the cost depending on the class type if it’s
									// first or business or economy
		if (ClassType == 'F')
			return 3000;
		else if (ClassType == 'B')
			return 2000;
		else
			return 500;
	}

	public Flight(Flight obj) {// a copy constructor that will copy the information of another object
		super("Flight");
		departure = obj.departure;
		ClassType = obj.ClassType;
	}

	public String toString() {// to show all the information of the flight service
		return super.getDetails() + "\n |departure| :  " + departure +"\\2026"+"\n |Class Type|: " + ClassType;
	}

}// end class
