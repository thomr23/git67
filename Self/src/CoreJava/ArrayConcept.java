package CoreJava;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to store similar datatype values
		
		//one dimension array or static array-fixed size
		
		//disadvantages-1.Size is fixed --to overcome we use collections --Arraylist,Hashtable --dynamic array
		//2.stores only similar datatypes--to overcome use object array
		
		//1.int array
		
		
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[2]);
		//System.out.println(i[4]); //ArrayIndexOutOfBoundsException:when size does not exist
		System.out.println(i.length);//size of array
		
		//use for loop for printing all values
		
		for (int j = 0; j < 4; j++) {
			
			System.out.println(i[j]);
			
		}
		
		//Object array--Object is a class-different datatypes values
		
		Object obj[] = new Object[5];
		obj[1] = "Tom";
		obj[2] = 12;
		obj[3] = 12.33;
		obj[4] = "1/1/1990";
		
		System.out.println(obj[3]);
		
	}

}
