package arrays;
//Array 26-9-2020

public class Array1 {

	public static void main(String[] args) {

		String ar[] = new String[5]; //1st Approach of creating of an array with string datatype

		ar[0] = "rahul";
		ar[1] = "majoj";
		ar[2] = "ganesh";
		ar[3] = "mahesh";
		ar[4] = "suresh";

		System.out.println(ar[0]);

		System.out.println(ar.length);

		for (int i = 0; i <= 4; i++) {

			System.out.println(ar[i]);
		}

	}

}
