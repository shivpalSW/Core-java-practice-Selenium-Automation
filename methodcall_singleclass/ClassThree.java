package methodcall_singleclass;//Live session example    28/7/2020
//CASE = 3
//****  Making a method call with argument within a single class*****
 //This example also an example of "Method Overloading"
public class ClassThree {

	public static void main(String[] args) {
		black();
		black(100);
		
		ClassThree obj = new ClassThree();
		obj.blue();
		obj.blue(200);

	}
	//1st static method
	public static void black() {
		System.out.println("1st Black method of ClassThree\n");
	}
	//2nd static method
	public static void black(int a) {
		System.out.println("2nd Black method of ClassThree\n");
	}
	
	//1st Non static method
	public void blue() {
		System.out.println("1st blue method of ClassThree\n");
	}
	//1st Non static method
	public void blue(int b) {
		System.out.println("2nd blue method of ClassThree\n");
	}
	

}
