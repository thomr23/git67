package AbstractionConcept;

public class HDFC extends Bank {
	
	public void loan() {//method overriding--overriding the abstract method defined in parent class//HDFC extends Bank means in abstract only need to specify the abstarct method no need ot specify other methods in parent class
		
		System.out.println("Loan--HDFC");
		
	}
	public void funds(){
		
		System.out.println("Funds---HDFC");
	}

}
