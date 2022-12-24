package introJava;
//Constructor practice =Non Argument or Zero argument constructor
public class Constructor1 {
	
	String Name; // Declaration of variable
	int Roll; // Declaration of variable
	static int Mobile; // Declaration of variable

	// Initialize
	Constructor1() { // its Zero argument constructor // Class name and Constructor name should be same

		Name = "Shivpal"; // assigning values to variables in constructor
		Roll = 12345; // assigning values to variables in constructor
		Mobile = 987456321; // assigning values to variables in constructor
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		System.out.println("**This is main method of Constructor1 class **");

		Constructor1 obj = new Constructor1();

		// new.Constructor1();
		// obj.ID; // It is not valid to call a constructor member in main method

		System.out.println(obj.Name);
		System.out.println(obj.Roll);
		System.out.println(obj.Mobile);

		obj.method1(); // Non -Static method call
		Constructor1.method2(); // static method call with the help of class name or else we can call directly
								// without creating an instance of a class
	}

	public void method1() { // Non- Static method
		System.out.println("**This is a Non static method of Constructor1 class**");
		int i = 100; // Local variable
		System.out.println(i); // local variable can call in a Non-static method
		System.out.println(Name); // Instance variable can call in a Non-static method
		System.out.println(Roll); // Instance variable can call in a Non-static method
		System.out.println(Mobile); // Static variable can call in a Non-static method
		new Constructor1();
	}
	public static void method2() { // Static method

		System.out.println("**This is a static method  of Constructor1 class**");
		int b = 200; // Local variable
		System.out.println(b); // local variable can call in a Non-static method
		System.out.println(Mobile); // calling a static variable in static method
		new Constructor1();

	}
}