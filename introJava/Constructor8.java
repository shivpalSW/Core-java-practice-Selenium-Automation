package introJava;

public class Constructor8 {
	// Declaration
	int AccountNo; 	// Instance variable
	String Name; 	// Instance variable
	String Address; // Instance variable

	// Initialization
	Constructor8() { // DEFAULT CONSTRUCTOR

		System.out.println("This is a Default constructor call \n");
		AccountNo = 852741;
		Name = "Mahesh Patil";
		Address = "Nashik\n";
	}

	Constructor8(int a, String b, String c) { // PARAMETERIZED CONSTRUCTOR
		this.AccountNo = a;
		this.Name = b;
		this.Address = c;
	}

	// Usage
	public void displayInformation() { // NON-STATIC METHOD
		System.out.println("This is Non Static method\n");
		System.out.println(
				"Account No :-> " + AccountNo + " | Account Holder Name:-> " + Name + " | Location:->  " + Address);
		// System.out.println(Name);
		// System.out.println(Address);

	}

	public static void main(String[] args) {
		Constructor8 obj = new Constructor8(); // Default constructor call

		Constructor8 pc1 = new Constructor8(123456, "Vijay Patil ", "Pune\n"); // For Invoking Parameterized constructor
		Constructor8 pc2 = new Constructor8(963852, "Akash Patil", "Mumbai"); // For Invoking Parameterized constructor
		obj.displayInformation(); // This fetches class level data
									// variables to implement in default constructor

		pc1.displayInformation(); // Method call to pass pc1 reference related variables
		pc2.displayInformation(); // Method call to pass pc2 reference related variables
		// new Constructor8(); //This will call Default constructor
	}

}
