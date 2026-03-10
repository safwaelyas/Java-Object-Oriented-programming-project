//Dina Alyabis - 446202768 Donne
public class CarRental extends Service {
	private char carType ;
	private int rentalDays ;

		public CarRental() {
			super("Car");
			carType ='0';
			rentalDays= 0;
		}
		public CarRental(char carType,int rentalDays) {
			super("Car");
			this.carType=carType;
			this.rentalDays = rentalDays;
		}
		public double calculateCost() {
			if(carType=='L')
			return (double)(rentalDays * 1000);
			else
			return (double)(rentalDays * 100);
		}

public CarRental( CarRental obj) {
	super("Car");
	carType = obj.carType;
	rentalDays = obj.rentalDays;
}

	public String toString(){
	return super.getDetails()+" \n , carType : " + carType + "\n , rentalDays :  "+ rentalDays ;
	}


	
}
