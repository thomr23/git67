package OOPSconceptPart2;

import java.util.ArrayList;

public class ArrayListconcept {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		
		a.add(100);//add() method
		a.add(200);
		a.add("Tom");
		
		//ar.remove(Index)--to remove one value
		
		System.out.println(a.size());
		
		System.out.println(a.get(2));
		
		//System.out.println(a.get(3));//'java.lang.IndexOutOfBoundsException' is index given is more than size
		
		//to print all values of array or arraylist--for loop
		
		for(int i = 0;i<a.size();i++) {
			System.out.println(a.get(i));
			
		}
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();//give that datatype and only will allow that 
		
		a1.add(100);
		
		
	}

}
