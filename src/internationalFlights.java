
public class internationalFlights extends Flight {
	private boolean Visa;

	
	public InternationalFlight(int departure,char ClassType,,boolean Visa) {
		super(departure,ClassType);
		this.Visa = Visa;
	}

public double calculateCost() {
	return super.calculateCost()+1000;
}

		
public String toString(){//show information
return super.toString()+" \n , Visa : " + Visa + "
}


public boolean getVisa(){//getter
return Visa;
}// e 

public void setVisa(boolean Visa) { // s setter
	this.Visa = Visa; 
}//e setter



}
