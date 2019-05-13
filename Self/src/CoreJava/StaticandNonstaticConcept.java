package CoreJava;

public class StaticandNonstaticConcept {
	
	String name = "Tom";//non-static varia
	static int age = 25;//static var

	public static void main(String[] args) {
		
		//How to call static methods and var:call directly or using class name
	sum();	
	StaticandNonstaticConcept.sum();
	System.out.println(age);
	System.out.println(StaticandNonstaticConcept.age);
	
		//How to call non-static methods and var:call only thru object
	StaticandNonstaticConcept obj = new StaticandNonstaticConcept();
	obj.sendMail();
	System.out.println(obj.name);
	
	//can i access static methods using object reference--yes--but warning will be given as static method/var call in static way..
	
	
	
	
	

	}
	
	public void sendMail() {
		
		System.out.println("send mail");
		
	}

	public static void sum() {//static method
		System.out.println("Sum method");
		
	}
}
