
public class internationalFlights extends Flight {
	private boolean Visa;
	private double BaggegeWeigth;
	private String PassportNumper; 
	private String ClassType; 

	
	public InternationalFlight(String serviceId,String name,double price,String airline,String departure,String arrival,String Visa,double BaggegeWeigth,String PassportNumper , String ClassType) {
		super(serviceId,name,price,airline,departure,arrival);
		this.Visa = Visa;
		this.BaggegeWeigth = BaggegeWeigth;   //const
		this.PassportNumper = PassportNumper;
		this.ClassType = ClassType;
	}

public double calculateCost() {
	double cost = super.calculateCost();
	return cost + calculateBaggegeFee();
			
}

public double calculateBaggegeFee() {
	if(ClassType.equals("First")&& BaggegeWeigth > 30000)
		return (double)(BaggegeWeigth * 15);
		else
			if(ClassType.equals("Business")&& BaggegeWeigth > 25000))
				return (double)(BaggegeWeigth) * 25);
			else
				if(ClassType.equals("Economy")&& BaggegeWeigth > 20000))
					return (double)(BaggegeWeigth) * 25);
					else
						return (double)(BaggegeWeigth * 35);
}
	
	
public String toString(){//show information
return super.toString()+" \n , Visa : " + Visa + " , BaggegeWeigth :  "+ BaggegeWeigth +  " , PassportNumper :"+PassportNumper;
}

public String getPassportNumper(){//getter
return PassportNumper;
}// e 

public boolean getVisa(){//getter
return Visa;
}// e 

public double getBaggegeWeigth(){//getter
return BaggegeWeigth ;
}// e 

public void setVisa(boolean Visa) { // s setter
	this.Visa = Visa; 
}//e setter

public void setPassportNumper(String PassportNumper) { // s setter
	this.PassportNumper = PassportNumper; 
}//e setter

public void setBaggegeWeigth(double BaggegeWeigth) { // s setter
	this.BaggegeWeigth = BaggegeWeigth; 
}//e setter

}
