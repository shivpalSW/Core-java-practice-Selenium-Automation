package oops_Inheritance;
//Hierarchical Inheritance 
//This is sub/child class 1

public class Hierarchical2 extends Hierarchical1 {  //extending class= Hierarchical1

	public void methodB() {
 
		System.out.println("This is method B");
	}
	
	public static void main(String[] args) {
		Hierarchical2 obj = new Hierarchical2();
		obj.methodA();
		obj.methodB();
		
	}

}

