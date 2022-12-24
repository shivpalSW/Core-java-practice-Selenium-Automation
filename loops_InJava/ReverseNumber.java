package loops_InJava;

public class ReverseNumber {

	public static void main(String[] args) {
		int i = 12345;
		int A = 0;
		int T;

		while (i != 0) {
			T = i % 10; 		//Remainder	
			A = A * 10 + T;  	// 
			i = i / 10;  		//Quotient 	

		}
		System.out.println("Reversed Number is: " + A);
	}

}
