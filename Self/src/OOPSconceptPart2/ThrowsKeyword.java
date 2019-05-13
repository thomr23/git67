package OOPSconceptPart2;

public class ThrowsKeyword {

	public static void main(String[] args) throws ArithmeticException {
		
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.div();
		System.out.println("Exception...");
		
	}
	public void div() throws ArithmeticException {
		
		try{
			int i=9/0;//exception line
		}
		catch(Throwable e) {//Throwable is the superclass of all errors and exception if u dont know what is the error or exception
			//Catch(Exception e1)--can take care of any exception
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		
	}

}
