package OOPSconceptPart2;

public class ConstructorConcept {//Constructor is to intitialize class var or class properties.Getter setter is used for encapsulation to achieve private var
	
	//class var
	String name;
	int age;
	
	public ConstructorConcept() {//Constructor name-Same name as class name
		System.out.println("Default Constructor");
		
	}
	
	public ConstructorConcept(int i) {//Constructor name-Same name as class name
		System.out.println("1 param");
		System.out.println(i);
	}
	public ConstructorConcept(int i,int j) {//Constructor name-Same name as class name
		System.out.println("2 param");
		System.out.println(i+" "+j);
	}
	
	//either give diff names for Class var and local var;or use this keyword
	public ConstructorConcept(String name,int age) {//Constructor name-Same name as class name
		this.name=name;//this.class var= local var
		this.age=age;
		
	}

	public static void main(String[] args) {
		ConstructorConcept obj=new ConstructorConcept();
		ConstructorConcept obj1=new ConstructorConcept(10);//calling the one param constructor and pasisng vlaues
		ConstructorConcept obj2=new ConstructorConcept(20,21);
		ConstructorConcept obj3=new ConstructorConcept("Tom",25);//So if there is Human class and we want ot rrnsfer proerties like name and age,we just have to create for eg 100 objects or 
		//humans and just have to call them using object refernce .We can pass each values in each object
		ConstructorConcept obj4=new ConstructorConcept("Steve",25);
		ConstructorConcept obj5=new ConstructorConcept("Vidhu",25);
		ConstructorConcept obj6=new ConstructorConcept("Raji",25);
		
		System.out.println(obj3.name);
		System.out.println(obj5.name);
		System.out.println(obj6.age);
	
	}

}
