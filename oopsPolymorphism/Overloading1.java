package oopsPolymorphism;
//It is an example of "Compile time Polymorphism" -(Method overloading)
// 16/8/2020
public class Overloading1 {
	
	public void area (int a, int b) {
		double c = a * b + a ;
		System.out.println(c);
	}
	
	public void area (int a) {
		double c = a * a + a ;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Overloading1 obj = new Overloading1();
		obj.area(10 , 20);
		obj.area(10);
	}

}
