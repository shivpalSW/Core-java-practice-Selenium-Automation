package introJava;

public class Constructor3 {
	// ***********PASSING AN ARGUMENT IN A METHOD**********
	public static void main(String[] args) {
		System.out.println("**This is main method**");
		studentID(3122233);
		studentID();
		
	}

	public static void studentID(int i) {
		System.out.println("This is static method 1");
		int rollno = 20;
		System.out.println(rollno);
	}
	public static void studentID() {
		
		System.out.println("This is static method 2");

	}
}
