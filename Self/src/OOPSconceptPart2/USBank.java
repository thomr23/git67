package OOPSconceptPart2;

//Interface
//1.Only method declaration--not brackets--only method prototype,//2,Variables are by default static,3.Var value cannot be changed,4.No static methods in interface
//5.NO main method,6.Cannot create object of interface--ie abstract in nature--cannot abstantiate

public interface USBank {

	int min_bal = 100;//static in nature and final in nature
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	
}
