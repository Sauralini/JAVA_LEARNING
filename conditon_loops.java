package test;

public class conditon_loops {
	public static void main(String[]args) {
		
		int a; // declaration that some value will be saved in the variable a
		int b=5; // value initialize 
		
		int c=20;
		String s="java";
		
		System.out.println(s);
		System.out.println(b);
		System.out.println(b+c);
		System.out.println(s+b+c);// alphabet + numeric with get concatenate
		
		// condition below // if -else condition
		a=3;
		
		if(a>b) {
			System.out.println("a is greater");
		}else {
			System.out.println("b is greater");
		}
		// if else with AND OR operator
		
		if(a>b & a>c) {
			System.out.println("a is greater");
		}
		else if (b>c) {
			System.out.println("b is greater");
		}
		else {
			System.out.println("c is greater");
			
		}
		
		
		//loops to study
		//i=0// initilization
		//i>5, contidion
		//i++ increement operator
		// for loop 
		System.out.println();
		for (int i=0;i<5;i++)
		{
			System.out.println("java  "+i);
		}
		
	}

}
