//Dina Alyabis - 446202768 Donnnnne
public class Flight extends Service{

protected int departure ;
protected char ClassType; 

public Flight() {//defaulte cons
super("Flight");
this.departure=1;
this.ClassType ='0';
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
public Flight( Flight obj) {
	super("Flight");
	departure = obj.departure;
	ClassType = obj.ClassType;
}


public String toString(){
return super.getDetails() + "\n , departure :  "+ departure+"\n, Class Type: "+ ClassType;
}

}//end class
