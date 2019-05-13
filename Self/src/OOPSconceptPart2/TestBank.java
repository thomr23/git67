package OOPSconceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		//USBank b = new USBank(); //cannot instantiate an Interfcae
		
		HSBCbank h = new HSBCbank();
		h.credit();//interface method--overriden
		h.debit();//interface method--overriden
		h.transferMoney();//interface method--overriden
		h.eduloan();//hsbc only method
		
		//dynamic polymorphism--
		//child class object can be referred by parent interface reference var
		
		USBank b1 = new HSBCbank();//only overriden methods will be called
		b1.credit();
		b1.debit();
		b1.transferMoney();
		
		
	}

}
