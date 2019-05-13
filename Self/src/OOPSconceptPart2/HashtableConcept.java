package OOPSconceptPart2;

import java.util.Hashtable;

public class HashtableConcept {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		
		h.put("A", "Test");//put()--method
		h.put("B", "Hello");
		h.put("C", "World!");
		
		System.out.println(h.size());
		
		h.put(1,200);
		
		System.out.println(h.size());
		
		System.out.println(h.get("A"));
		
		h.put(8, 70);
		
		Hashtable<Integer,Integer> h1 = new Hashtable<Integer,Integer>();
		
		h1.put(1, 478);
		
		System.out.println(h1.get(1));
		
		
	}
	
	
	}
		

		
		
		
		
		
	
