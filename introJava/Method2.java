package introJava;

public class Method2 {

	public static void main(String[] args) {
		
		Method2 obj =  new Method2 (); // object 
		
	//myfirstmethod1(); //calling a static method by  direct method on call level
		obj.myfirstmethod1();
		obj.myfirstmethod2(); //calling a Non static method by creating a a object and method call
		
	}
	public static void myfirstmethod1() {  //static method
		System.out.println("This is static method 1");
	}
	
	public void myfirstmethod2() {   // Non-static method
		System.out.println("This is Non-static method 2");
	
	}
}
