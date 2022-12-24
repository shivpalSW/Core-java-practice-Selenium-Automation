package introJava;
//***********USER DEFINED PARAMETERIZED CONSTRUCTOR**********
public class Constructor5 {
	

		int id; // Instance variable
		String Name; // Instance variable
		String Address; // Instance variable

	Constructor5() { // DEFAULT CONSTRUCTOR
		System.out.println("This is a Default constructor call\n");
	}

	Constructor5(int a, String b, String c) { // PARAMETERIZED CONSTRUCTOR
		this.id = a;
		this.Name = b;
		this.Address = c;
	}

	public void displayInformation() { // NON-STATIC METHOD
		System.out.println("This is a NON-STATIC METHOD");
		System.out.println(id );
		System.out.println(Name); 
		System.out.println(Address);
		//new Constructor3 ();
	}

	public static void main(String[] args) {
		Constructor5 obj = new Constructor5(); 						// Default constructor calling

		Constructor5 pc1 = new Constructor5(1, "Ram", "Pune"); 		// Parameterized constructor calling
		Constructor5 pc2 = new Constructor5(2, "Sham", "Mumbai");   // Parameterized constructor calling
		//obj.displayInformation(); 								// This will give null values

		pc1.displayInformation();
		pc2.displayInformation();
		//new Constructor5();
	}

}
