package oops_Abstraction;
//Abstraction example with Multilevel Inheritance example
//child class 
public abstract class AbstractMulti2 extends AbstractMulti1 {
	
	 public void m5 () {  // This is concrete method
		 System.out.println("concrete method m5 of child class AbstractMulti2");
	 } 
	 // We can not create object here as implementation is not provided to method m4

}
