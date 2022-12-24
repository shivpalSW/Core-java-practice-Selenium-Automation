package oops_Abstraction;
//Child class
//Abstraction with a single-level inheritance and overriding
//Object can be created in once implementation provided to abstract method

public class Abst2 extends Abst1{

	@Override
	public void m4() {   // Implementation provided to abstract method in child class
		System.out.println("m4 method Implemented in child class");	
	}
	
	public static void main(String[] args) {
		Abst2 obj = new Abst2();
		
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();  				
	}	
}
