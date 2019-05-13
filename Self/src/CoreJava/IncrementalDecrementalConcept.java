package CoreJava;

public class IncrementalDecrementalConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		int j = i++;//Post increment-give value of i to j then increase value of i
		System.out.println(i+"\t"+j);
		
		int a = 1;
		int b = ++a;//Pre increment-increase value of a first and give it to b and a is also increased so a is 2 and b is also 2
		System.out.println(a+"\t"+b);
	}

}
