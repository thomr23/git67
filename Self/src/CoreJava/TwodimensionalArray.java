package CoreJava;

public class TwodimensionalArray {// used to fetch data from Excel sheets

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x[][] = new String[2][2];//[n+1]-Space allocated: where n is row/col number
		System.out.println(x.length);//length of rows---3
		System.out.println(x[0].length);//number of cols 
		
		//first row
		x[0][0] = "A";
		x[0][1] = "B";
		x[1][0] = "C";
		x[1][1] = "D";
		
		System.out.println(x[0][1]);

		//Print all values in 2D Array---use 2 for loop
		
		//row =0,col= 0 to 1,
		//row =1,col= 0 to 1
		
		for(int row=0;row<x.length;row++) {//outer loop
			for(int col=0;col<x[0].length;col++) {//inner loop--executed first
				System.out.println(x[row][col]);
				
			}
		}
			
	}

}
