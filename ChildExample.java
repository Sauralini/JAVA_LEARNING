package test;

public class ChildExample extends ParentExample{//use extends after child class and write parent class name
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildExample ce=new ChildExample();
		ce.childtest();
		ce.test();//write the parent class method with reference with child ref id
		ce.add();//method overriding means to call the method 
		
	}
	
	public void childtest() {
		System.out.println("child case");
	}
	
	public void add1() {
		System.out.println("add method from parent class");
	}

}
