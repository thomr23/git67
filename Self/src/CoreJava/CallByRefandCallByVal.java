package CoreJava;//not clear hv to look again--doubt

public class CallByRefandCallByVal {

	public static void main(String[] args) {

		CallByRefandCallByVal obj = new CallByRefandCallByVal();
		int x = 20;
		int y = 20;
		obj.sum(x, y);//call by value or pass by value--copy of values x and y is given,but here since a and b is changed later to 30 30 then it will have that value only
		
	}
	
	public int sum(int a,int b){
		a=30;
		b=30;
		int c = a+b;
		System.out.println(c);
		return c;
		
	}

}
