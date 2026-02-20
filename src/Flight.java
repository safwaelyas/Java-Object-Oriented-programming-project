//Dina Alyabis - 446202768 Donnnnne
public class Flight extends Service{

private String airline ;
private String departure ;
private String arrival ;

public Flight() {//defaulte cons
super("","",0);
this.airline="";
this.departure="";
this.arrival = "";
	}

public Flight( String serviceId , String name, double price, String airline, String departure, String arrival) {// cons
super(serviceId,name,price);
this.airline=airline;
this.departure=departure;
this.arrival = arrival;
	
	}
public double calculateCost() {
	return;
}

public String getairline(){//getter
return airline ;
}// e 

public String getdeparture(){//getter
return departure ;
}// e 

public String getarrival(){//getter
return arrival ;
}// e 


public void setairline(String airline) { // s setter
	this.airline = airline; 
}//e setter

public void setdeparture(String departure) { // s setter
	this.departure = departure; 
}//e setter

public void setarrival(String arrival) { // s setter
	this.arrival = arrival; 
}//e setter


public String toString(){
return super.toString() +" \n , airline : " + airline + " , departure : \ "+ departure +  " , arrival :"+arrival;
}

}//end class
