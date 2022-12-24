package oops_Abstraction;
//Abstraction example
//Parent class with a concrete method and  abstract method
//Multilevel Inheritance example

public abstract class AbstractMulti1 {
	

	public void m1() {
		System.out.println("concrete method m1");
	}

	public void m2() {
		System.out.println("concrete method m2");
	}

	public void m3() {
		System.out.println("concrete method m3");
	
	}
	abstract public void m4();  //un-implemented abstract method in parent class
								//unimplemented method means = No method body
}								//Object can not be created in this class


