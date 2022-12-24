package oops_Inheritance;
//Hierarchical Inheritance 
//This is sub/child class 3
public class Hierarchical4 extends Hierarchical1 { //extending class= Hierarchical1
	
	public void methodD() {
		
		System.out.println("This is method D");
	}
	
	public static void main(String[] args) {
		
		Hierarchical4 obj = new Hierarchical4();
		obj.methodA();
		obj.methodD();
	}


}
