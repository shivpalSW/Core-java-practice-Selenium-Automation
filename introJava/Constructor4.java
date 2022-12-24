package introJava;

public class Constructor4 {
	// ***********USER DEFINED PARAMETERIZED CONSTRUCTOR**********Live Lecture
	// example

	// Declaration

	int empId; // 101     //Global Variable
	String empName;// Amit  //Global Variable

	// Initialization

	// 1 Constructor
	Constructor4(int id, String name) {
		this.empId = id;// 101  //Use of this keyword
		this.empName = name; // Shivpal
	}

	// 2 Constructor
	Constructor4() {
		empId = 104;
		empName = "Shivpal";
	}

	// 3 Constructor
	Constructor4(int id2) {
		this.empId = id2;
	}

	public static void main(String[] args) {

		// object 1
		Constructor4 t = new Constructor4();
		System.out.println(t.empId);
		System.out.println(t.empName);

		// object 2
		Constructor4 k = new Constructor4(101, "Amit");
		System.out.println(k.empId);// 101
		System.out.println(k.empName); // Amit

		// object 3
		Constructor4 k2 = new Constructor4(7890);
		System.out.println(k2.empId); // 7890

	}
}
