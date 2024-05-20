package test;

public class ParentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentExample pe=new ParentExample();
		pe.test();
		pe.add();
		
	}
	
	public void test() {
		System.out.println("parent child test");
	}

	public void add() {
		System.out.println("parent class is going to execute at child");
	}
}
