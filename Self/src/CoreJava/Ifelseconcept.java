package CoreJava;

public class Ifelseconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 30;
		int b = 20;
		
		if (b>a) {
			System.out.println("b is greater than a ");
			
		} else {
			System.out.println("a is greater than b");

		}
		
		//Greatest of 3
		
		int a1 = 100;
		int b1 = 200;
		int c1 = 300;
		
		//nested if-else
		
		if(a1>b1 & a1>c1) {//false & false is false
			System.out.println("a1 is greatest");
			
		}
		else if (b1>c1) {
			
			System.out.println("b1 is the greatest");
				
		 				}
		
		else {
			
			System.out.println("c1 is greatest");
			}

	}
	
	

}
