package oops_Inheritance;
//Multiple Inheritance
public class ClassC extends ClassA { //extends ClassB {//Multiple inheritance is not possible
									//	this is diamond ambiguity problem
	 public void friends () {
		 
		 System.out.println("I have friends");      
		 
	 }

}// Java does not supports multiple inheritance
