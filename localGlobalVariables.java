package test;

public class localGlobalVariables {
	
	int a=10;// global variable
	static int d=123;// global static varibale 
	

	public static void main(String[] args) {
		
		int b=200;//local varibale (local varibale lies inside the function
		//System.out.println(a);
		System.out.println(d);
		System.out.println(b);
		localGlobalVariables fe=new localGlobalVariables();
		fe.test();// calling method under static function so made a object using class
		
	}
	
	public void test() {
		int c=300;
		System.out.println(c);
		System.out.println(a);
		System.out.println(d);
		
	}

}
