package AbstractionConcept;

public interface Car {//all methods should be abstract--no need to write abstract also--no method body--only method declaration
	
	//final and static variables only
	//Full Abstraction
	//cannot create object of interfaces--as it is abstract in nature
	public void start();
	public void stop();
	public void refuel();
}
