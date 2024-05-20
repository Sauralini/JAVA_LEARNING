package test;

public class FUNCTION_METHODS {

	// MAIN METHOD/FUNCTION
	public static void main(String[] args) {
		
		// FUNCTIONS/ METHODS ARE PARALLEL TO EACH OTHER THEY CAN BE WORK WITH IN THE TIME
       // to call a function main function is important // there are three ways to call a function

      add();  // to call a function syntax one way
      FUNCTION_METHODS fe = new FUNCTION_METHODS();
      fe.sub();  // to call a function syntax second way we need to make object of the method using class and then call it
	
     // FUNCTION_METHODS fe=new FUNCTION_METHODS();// how to create object 
		//FUNCTION_METHODS fe1=new FUNCTION_METHODS();// fe and fe1 and fe
		//FUNCTION_METHODS fe2=new FUNCTION_METHODS();
      
		
	}
	
	public static void add() { // to write method/function syntax
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
	}
		public void sub() { // to write method/function syntax
		int a=10;
		int b=20;
		int c=b-a;
		System.out.println(c);
		
	}
}
