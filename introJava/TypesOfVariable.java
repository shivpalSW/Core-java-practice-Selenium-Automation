package introJava;

// ++++++++++Variables and their scope within a class and the method body+++++++++

public class TypesOfVariable {

	// we can declare Global and static variables in inside class body only .
	// i.e outside method body only
	int Num = 100; // Global variable or Instance variable
	static int A = 50; // Static variable

	public static void main(String[] args) { // Main method
		TypesOfVariable obj = new TypesOfVariable(); // Object creation syntax to call static and non static methods
		obj.mymethod1();
		obj.mymethod2();

	}

	public static void mymethod1() { // static method
		int b = 100; // local variable
		System.out.println(b); // we can call local variable as well as static variable in this method
		System.out.println(A); // we can not call instance variable to this method
	}

	public void mymethod2() { // Non-static method
		char c = 'q'; // local variable
		System.out.println(c); // we can call local variable as well as static variable in this method
		System.out.println(Num);  // we can call instance "Num" variable to this method
		System.out.println(A); // we can call static "A" variable to this method

	}
}