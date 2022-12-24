package oops_Abstraction;
//Object can be created in once implementation provided to abstract method
public class AbstractMulti3 extends AbstractMulti2 {
	
	@Override
	public void m4() { // Implementation provided in child class

			System.out.println("m4 method Implemented in child class");
		}
	
	void m6() {
		System.out.println("concrete method m6");
	}
	
	public static void main(String[] args) { // Main method
		AbstractMulti3 obj = new AbstractMulti3();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
		obj.m5();
		obj.m6();
	}	
	
}