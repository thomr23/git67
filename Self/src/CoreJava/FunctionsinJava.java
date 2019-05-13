package CoreJava;

public class FunctionsinJava { //functions and methods are same --if u want to call a non-static method in main method u have to create an object

	//main method starting point of execution-VM checks nothing is inside--create object of class
	//main method is void--it never returns a value
	public static void main(String[] args) {
		
		FunctionsinJava obj = new FunctionsinJava();//non-static methods--no static keyword--the copy of the methods created below will be given to new
		//copy of all non-static methods will be given to the 'new FunctionsinJava' object
		obj.test();
		
		int j = obj.pqr();//obj.pqr() has value 'c' so assigning to int j and printing value as 'j'.Also will print whatever is in the method
		System.out.println(j);
		
		String s = obj.qa();
		System.out.println(s);
		
		int div = obj.division(30, 10);//30-x and 10-y ie one to one mapping,obj.division(30,10) gives to div
		System.out.println(div);
		
	}
		public void test() {//void is return type--//1st type of function or method--no input,no output
			
			System.out.println("test method");
			
		}
		public int pqr() { //void means should not return any value,return type,so if we are keeping return then instead of void give datatype
			System.out.println("pqr method");//2nd type of method--no input,some output returned
			int a = 10;
			int b = 20;
			int c = a+b;
			
			return c;//so give int return type
			
		}
	
		public String qa() {
			
			System.out.println("qa method");
			String S = "Selenium";
			return S;
		}
		//x,y --input arguments/parameters
		public int division(int x,int y) {
			System.out.println("divison method");
			int d = x/y;
			
			return d;
			
		}
		
		

	}


