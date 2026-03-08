//Dina Alyabis - 446202768 Donne
public class CarRental extends Service {
	private char carType ;
	private int rentalDays ;

		public CarRental() {
			super("Car");
			carType ='';
			rentalDays= 0;
		}
		public CarRental(char carType,int rentalDays) {
			super("Car");
			this.carType=carType;
			this.rentalDays = rentalDays;
		}
		public double calculateCost() {
			if(carType=='L'||carType=='l')
			return (double)(rentalDays * 1000);
			else
			return (double)(rentalDays * 100);
		}

public CarRental( CarRental obj) {
	super("Car");
	carType = obj.carType;
	rentalDays = obj.rentalDays;
}

		
	public char getcarType(){//getter
	return carType ;
	}// e 

	public int getrentalDays(){//s getter
		return rentalDays;
	}// e getter


	public void setrentalDays(int rentalDays) { // s setter
		this.rentalDays = rentalDays; 
	}//e setter	
		

	public String toString(){
	return super.getDetails()+" \n , carType : " + carType + " , rentalDays : \ "+ rentalDays ;
	}


	
}
