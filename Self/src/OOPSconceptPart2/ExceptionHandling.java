package OOPSconceptPart2;

public class ExceptionHandling {
	
	int a = 10;

	public static void main(String[] args) {
		
		//uncaught exception--complier wont catch it--unhandled
	//	int i=9/0;
	//	System.out.println(i);//ArithmeticException

	//caught exception--compiler catches it-handled
		//Thread.sleep(2000);//unhandled exception
	
	//ExceptionHandling obj=new ExceptionHandling();//NullPointerException
	//obj=null;
	//System.out.println(obj.a);
	
	//1.try-catch block--useful when exception comes and handle,reporting sth
	try {
		int i=9/0;//this code whihc gives exception
		}
	catch(ArithmeticException e){//what kind of exception
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	
	System.out.println("ABC");
	
	
	}

}
