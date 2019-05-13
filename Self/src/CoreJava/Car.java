package CoreJava;

public class Car {
	
	//class variables--Global variable
	//copy of these 2 variable will be given to each of the 3 object created below
	
	int mod;
	int wheel;

	public static void main(String[] args) {//object is the physical entity for class
		// TODO Auto-generated method stub
		
		
		//3 objects created
		//new is used to create object
		//a,b,c--object reference variable--not the object,but refernce name
		Car a = new Car();//'new car()'-new car will be created--'object of car class',a is referring/representing that new object
		Car b = new Car();
		Car c = new Car();
		
		a.mod = 2015;//defining 'a' object 
		a.wheel = 4;
		
		b.mod = 2014;//defining 'b' object 
		b.wheel = 4;
		
		c.mod = 2016;//defining 'c' object 
		c.wheel = 4;
		
		System.out.println("Before shifting of reference");
		
		System.out.println(a.mod);
		
		System.out.println("Before shifting of reference");
		
		a=b;
		b=c;
		c=a;
		
		a.mod = 10;
		System.out.println(a.mod);
		c.mod = 20;
		System.out.println(c.mod);
		

	}

}
