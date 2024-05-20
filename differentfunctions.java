package test;

public class differentfunctions {

	public static void main(String[] args) {
		
		differentfunctions ad1=new differentfunctions();
		ad1.add();
		ad1.add1(10,20);
		ad1.add1(1000,2000);
		ad1.add1(100120,21452);
		ad1.add1(14523,1458226);
		int x=ad1.add2(200, 100);// calling for the return function
		System.out.println(x);// print return function
	}

	public void add() {/// method with out parameter
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	//method with parameter
	
	public void add1(int a,int b) {
		System.out.println(a+b);
	}	
		// function with parameter and return functionality as void return nothing so we change void with some datatype
	
	public int add2(int a,int b) {
		int c=a+b;
		return c;
		
	}

}
