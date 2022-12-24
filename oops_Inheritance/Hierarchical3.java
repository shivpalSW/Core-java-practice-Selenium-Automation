package oops_Inheritance;
//Hierarchical Inheritance 
//This is sub/child class 2
public class Hierarchical3 extends Hierarchical1 { //extending class= Hierarchical1

	public void methodC() {
		
		System.out.println("This is method C");
	}
	
	public static void main(String[] args) {
		Hierarchical3 obj = new Hierarchical3();
		obj.methodA();
		obj.methodC();
	}

}
