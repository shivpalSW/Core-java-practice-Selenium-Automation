package introJava;

// Constructor example from Onkar
public class Constructor6 {

	String name;
	int id;
	static int mob;

	Constructor6() { // NON ARGUMENT CONSTRUCTOR

		name = "Onkar";
		id = 46;
		mob = 987654321;
		System.out.println("Hi, my details are shared as follows in Default constructor:-\n");

	}

	Constructor6(String a) { // PARAMETERIZED CONSTRUCTOR

		name = "Shivpal";
		id = 12;
		mob = 123456789;
	}

	public static void main(String[] args) {

		System.out.println("This is the main method output\n");
		Constructor6 f = new Constructor6();
		System.out.println(f.name + "\n"); // ACCESING A VALUES FROM A NON ARGUMENT CONSTRUCTOR
		System.out.println(f.id + "\n"); // ACCESING A VALUES FROM A NON ARGUMENT CONSTRUCTOR
		System.out.println(mob + "\n"); // ACCESING A VALUES FROM A NON ARGUMENT CONSTRUCTOR
		method1(); // Static method call WITHOUT ARGUMENT AND PARAMETERS
		method1("Shivpal"); // static method call WITH A PARAMETERS OR ARGUMRNT
	}

	public static void method1() { // STATIC METHOD WITHOUT ARGUMENT

		System.out.println("Static method output\n");
		new Constructor6(); // ACCESSING NON ARGUMENT CONSTRUCTOR (DEFAULT)
		System.out.println("Static variable can be accessed directly " + mob + "\n"); // STATIC VARIABLE CALL IN STATIC
																						// METHOD

	}

	public static void method1(String S) { // STATIC METHOD WITH AN ARGUMENT

		new Constructor6();
		Constructor6 t = new Constructor6("Shivpal\n");
		System.out.println(t.name + "\n");
		System.out.println(t.id + "\n");
		System.out.println(mob);

	}
}
