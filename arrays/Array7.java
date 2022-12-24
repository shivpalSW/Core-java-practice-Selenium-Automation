package arrays;

public class Array7 {

	public static void main(String[] args) {

		int ar[][] = { { 10, 20, 30, }, { 40, 50, 60, }, { 70, 80, 90 } };

		// Total rows
		int row = ar.length; // Length is the property of an array
		System.out.println("Total rows : " + row);

		// Total column
		int column = ar[0].length;
		System.out.println("Total columns : " + column);

		// Outer loop
		for (int i = 0; i < ar.length; i++) { 
			// Inner Loop
			for (int j = 0; j <= 2; j++) { 

				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}

}
