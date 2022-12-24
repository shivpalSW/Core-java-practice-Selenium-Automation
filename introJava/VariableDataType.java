package introJava;

public class VariableDataType {

	public static void main(String[] args) {

		boolean b = false;
		byte e = 127; // Range between (-127 to +127)
		short f = 32767;
		int i = 241483647;
		long l = 1234567890123456789l;
		float g = 35.34f;
		double u = 789.009d; // Use for dynamically changing values
		char k = 'A';
		String str = "Java program";

		System.out.println(b);
		System.out.println(e);
		System.out.println(f);
		System.out.println(i);
		System.out.println(l);
		System.out.println(g);
		System.out.println(u);
		System.out.println(k);
		System.out.println(str);

		System.out.println("variables are : + " + b + e + f);

	}

}
