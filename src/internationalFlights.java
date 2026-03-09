
public class internationalFlights extends Flight {
	private boolean Visa;

	
	public internationalFlights(int departure,char ClassType, boolean b) {
		super(departure,ClassType);
		this.Visa =b;
	}

public double calculateCost() {
	return super.calculateCost()+1000;
}


public internationalFlights( internationalFlights obj) {
	super(obj.departure,obj.ClassType);
	Visa = obj.Visa;
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
