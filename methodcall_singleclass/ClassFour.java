package methodcall_singleclass;//Live session example    28/7/2020
//CASE = 4
//****  Making a method call with argument with different classes*****
//This example also an example of "Method Overloading"

public class ClassFour {
	
	public void login (int a) {//Non-static method
		System.out.println("Login with single integer is working in Non-static method");
	}
	public void login (int b, int c) { //Non-static method
		System.out.println("Login with two integer arguments is working Non-static method");
	}
	  public static  void  login (int d, String s) { //static method
		System.out.println("Login with integer and string arguents is working of static method ");
	}
	public void login (int e, int f, String h) { //Non-static method
		System.out.println("Login is working in Non-static method");
	}
	

}
