package collecions;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add("abc");
		al.add(100);
		al.add('A');
		al.add(30.2);
		al.add(100);
		al.add(null);

		System.out.println(al);

		System.out.println(al.size());

		System.out.println(al.get(3));

		for (int i = 0; i <= al.size() - 1; i++) {
			System.out.println(al.get(i));
		}
		System.out.println(al.isEmpty());
		System.out.println(al.contains(100));

		// To remove data from input
		al.remove(2);
		System.out.println(al);

		// To modify data from input
		al.set(0, "ABCDEF");
		System.out.println(al);

	}

}
