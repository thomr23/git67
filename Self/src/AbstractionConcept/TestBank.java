package AbstractionConcept;

public class TestBank {

	public static void main(String[] args) {
	
		HDFC hb = new HDFC();
		hb.credit();
		hb.loan();
		hb.debit();
		hb.funds();
		
		Bank bk=new HDFC();
		bk.credit();
		bk.loan();
		bk.debit();
		//bk.funds()--cannot access--non-overriden
		
		//Bank bk1=new Bank();//cannot create object of abstract class

	}

}
