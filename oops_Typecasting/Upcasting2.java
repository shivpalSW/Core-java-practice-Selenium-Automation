package oops_Typecasting;
//Child class 
public class Upcasting2 extends Upcasting1 {
	
	public void job() {
		System.out.println("Child job");
	}

	public void bike () {
		System.out.println("Childs bike");
	}

	public static void main(String[] args) {
		Upcasting1 obj = new Upcasting2();  //Up-Casting is done here
		obj.car();
		obj.home();
		obj.money();
//--------------------------------------------------------------------------------		
		Upcasting2 obj1 = (Upcasting2)obj ;  // Down- casting
		
		obj1.job();  // For down casting Up-casting is mandatory
		obj1.bike(); // For down casting Up-casting is mandatory
		
		obj1.car(); // parent class related method also can be accessed
		obj1.home(); // parent class related method also can be accessed
		obj1.money(); // parent class related method also can be accessed
		
	}
}
