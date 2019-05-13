package CoreJava;

public class WrapperClassConcept {

	public static void main(String[] args) {
		String s = "100";
		System.out.println(10+s);
		
		//data conversion string to integer
		
		int i = Integer.parseInt(s);
		System.out.println(10+i);

		//string to char
		
		//string to double--double d = Double.parseDouble()
		
		//int to String
		int j = 200;
		System.out.println(j+20);
		
		String x = String.valueOf(j);//convert int to String
		System.out.println(x+20); //String x = "200" ;
		
		String u = "100A";  //java.lang.NumberFormatException when string is not a pure integer
		Integer.parseInt(u);
		
	}

}