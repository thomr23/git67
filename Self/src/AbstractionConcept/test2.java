package AbstractionConcept;

public class test2 {

	
	
	
		 int t1;
		 
			 public test2(){
				 t1=100; 
			 }
			 public test2(int t1){
					this.t1 = t1;
				 }
				 
			 public static void  main(String[] args)
			 {
				 int t1=50;
				 test2 obj = new test2(20);
				 System.out.println(obj.t1);
				 
		 }

}

