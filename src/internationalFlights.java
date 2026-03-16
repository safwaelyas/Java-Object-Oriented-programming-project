
public class internationalFlights extends Flight {

	// declaring variables
	private boolean Visa; // checking if their is a visa

	public internationalFlights(int departure, char ClassType, boolean b) {// a constructor that receive the attribute
																			// from the super class ( class flight) and
																			// visa
		super(departure, ClassType);
		this.Visa = b;
	}

	public double calculateCost() {// a method that will calculate the cost by adding 1000 -the International
									// flight fees
		return super.calculateCost() + 1000;
	}

	public internationalFlights(internationalFlights obj) {// a copy constructor that will copy the information of
															// another object
		super(obj.departure, obj.ClassType);
		Visa = obj.Visa;
	}

	public String toString() {// to show all the information of the international flight service
		return super.toString() + " \n , Visa : " + Visa;
	}

}// end class
