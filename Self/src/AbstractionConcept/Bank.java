package AbstractionConcept;

public abstract class Bank {
	
	//Abstarction-Hiding implementaion logic ..ie no body
	//Partial Abstraction
	
	//Abstract method
	
	public abstract void loan();//Abstract methods do not specify body//implemetation logic can be diff in child class although it can be overriden--no body only prototype--logic can be diff in child class
	
	//non-abstract method
	public void credit() {
		System.out.println("Bank--credit");
	}
	public void debit() {
		System.out.println("Bank--debit");
	}
	
}

