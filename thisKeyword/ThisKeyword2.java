package thisKeyword;

public class ThisKeyword2 {

	ThisKeyword2() {
		this(5);
		System.out.println("hello a");
	}

	ThisKeyword2(int x) {
		System.out.println(x);
	}

	public static void main(String args[]) {
		ThisKeyword2 a = new ThisKeyword2();
	}
}
