package introJava;
//***********USER DEFINED PARAMETERIZED CONSTRUCTOR**********Lecture 25/7/2020
public class Constructor7 {

	// Declaration
	int empId;
	String empName;

	// Initialization
	Constructor7() {
		empId = 178;
		empName = "Swati";
	}

	// Parameterized Constructor
	Constructor7(int id, String name) {
		this.empId = id;
		this.empName = name;
	}

	// Usage
	public void information() {
		System.out.println("ID: " + empId + " Candidate Name: " + empName);
	}

	public static void main(String[] args) {
		Constructor7 t = new Constructor7();
		t.information();

		Constructor7 y = new Constructor7(786, "Neha");
		System.out.println(y.empId);
		System.out.println(y.empName);

		Constructor7 u = new Constructor7(199, "Pooja");
		System.out.println(u.empId);
		System.out.println(u.empName);

	}

}
