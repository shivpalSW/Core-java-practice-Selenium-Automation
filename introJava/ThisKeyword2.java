package introJava;
 // *******Use of this "this" keyword******26/7/2020
public class ThisKeyword2 {

	int a = 10; // Global variable
	int b = 20; // Global variable

	public void getinfo(int c, int d) {

		//c = a;    //it will assign values from a class level variable to variable c
		//d = b;    //it will assign values from a class level variable to variable d
		
		this.a=c;   // 
		this.b=d;  //
		
		System.out.println(c);
		System.out.println(d);
	}

	public static void main(String[] args) {

		ThisKeyword2 obj = new ThisKeyword2();
		obj.getinfo(22, 33);

	}

}
