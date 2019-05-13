package OOPSconceptPart2;

public class ThrowKeyword {

	public static void main(String[] args) {
	
		System.out.println("ABC");

	
	try {
		throw new Exception("Raji Exception");//throw the new exception
	
	}catch(Exception e) {
		e.printStackTrace();
	}
	System.out.println("PQR");
	}
	
}
