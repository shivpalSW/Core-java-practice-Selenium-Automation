package arrays;
// Sorting of an Array in ascending and descending order
import java.util.Arrays;

public class Array3 {

	public static void main(String[] args) {

		int ar[] = new int[5];// Approach of creating of an array with integer datatype

		ar[0] = 10;
		ar[1] = 11;
		ar[2] = 25;
		ar[3] = 20;
		ar[4] = 15;

		System.out.println("Before sorting");
		for (int i = 0; i <= ar.length - 1; i++) {
			System.out.println(ar[i]);
		}
		// Now next task is to set elements in ascending order
		System.out.println("After sorting Ascending order");
		Arrays.sort(ar);

		for (int i = 0; i <= ar.length - 1; i++) {
			System.out.println(ar[i]);
		}
		System.out.println("After sorting Descending order");
		Arrays.sort(ar);

		for (int i = 4; i >=0; i--) {
			System.out.println(ar[i]);
		}
	}
}
