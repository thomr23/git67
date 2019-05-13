package OOPSconceptPart2;

public class TestCar {

	public static void main(String[] args) {
	
		
		//static polymorphism or compile time polymorphism--at time of Complilig JVM will check will--one to many--from parent class,child class etc
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftsafety();
		
		System.out.println("*********");
		
		//Top Casting--dynamic polymorphism
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();//c.theftsafety()--not accesible
		
		System.out.println("*********");
		
		//Car d  = new BMW();//Child class object can be referrred by parent class refernce is called Dynamic or runtime polymorphism
		
		//Down Casting--cast from Car to BMW class
		//BMW b1 = (BMW)new Car();//Compile will pass,but run time it will give you "ClassCastException"
		
	
	}

}
