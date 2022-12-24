package introJava;

public class ThisKeyword1 {

	int a = 10; // global variable
	int b = 20; // global variable

	public void getinfo() {

		int a = 30;// local variable
		int b = 40; // local variable

		System.out.println(a);		// 30
		System.out.println(b);		// 40
		System.out.println(this.a);	// 10
		System.out.println(this.b);	// 20
	}

	public static void main(String[] args) {
		ThisKeyword1 t = new ThisKeyword1();
		t.getinfo();   // 	 		Passing No Argument values here
	}

}
