package CoreJava;

public class MethodOverloadingConcept {//No method inside a method and no duplicate methods

	public static void main(String[] args) {
		
		MethodOverloadingConcept obj = new MethodOverloadingConcept();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 30);
		

			}
	//can we overload main method--yes,we can overload main method also--with diff atatype input parm public static void main(int p) 
	//You cannot create a method inside a method
	//duplicate methods--same method name with same name and same number of arguments,and same datatyepes  and input parameters is not allowed
	//Method Overloading---when the method name is same with different arguments with different data types within same class
	public void sum() {//0 parameter method
		System.out.println("Sum-0 parameter");
		
	}
	
	public void sum(int i) {//1 parameter method--so same name is okay--method overloading
		System.out.println("Sum -1 parameter");
		System.out.println(i);
		
		
	}
	public void sum(int i,int k) {//2 parameter method--so same name is okay--method overloading
		System.out.println("Sum -2 parameter");
		
	}
}
