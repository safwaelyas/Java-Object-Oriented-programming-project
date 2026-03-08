//Dina Alyabis - 446202768 Donnnnne
public class Flight extends Service{

private int departure ;
private char ClassType; 

public Flight() {//defaulte cons
super("Flight");
this.departure="";
this.ClassType = "";
	}

public Flight(int departure,char ClassType) {// cons
super("Flight");
this.departure=departure;
this.ClassType = ClassType;
	
	}
public double calculateCost() {
	if(ClassType=='F')
		return 3000;
		else if(ClassType=='B')
			return 2000;
		else return 500;
}


public int getdeparture(){//getter
return departure ;
}// e 



public void setdeparture(int departure) { // s setter
	this.departure = departure; 
}//e setter


public String toString(){
return super.getDetails()+" \n , airline : " + airline + " , departure :  "+ departure +  " , arrival :"+arrival;
}

}//end class
