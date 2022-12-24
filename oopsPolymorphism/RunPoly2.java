package oopsPolymorphism;
//Runtime Plymorphism or Method overriding

public class RunPoly2 extends RunPoly1 {
	
	public void marriage() {
		
		System.out.println("Modern girl");
		
	}
	public void gold() {
		System.out.println("with a gold");
	}
	public static void main(String[] args) {
		
		RunPoly2 obj = new RunPoly2();
		obj.marriage();
		obj.gold();
		
	}

}
