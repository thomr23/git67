package CoreJava;

public class LocalvsGlobalVariables {
	
	
	//Global variables or class variables--will be available throughout the program
	String name = "Tom";//non -static var
	int age = 25;

	public static void main(String[] args) {
		
		int i = 10; //local variables for main method-static var
		System.out.println(i);
		LocalvsGlobalVariables obj = new LocalvsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		
		

	}
	
	public void sum() {//non -static var

		int i = 15;//local var for sum method
		int j = 20;
		
	}

}
