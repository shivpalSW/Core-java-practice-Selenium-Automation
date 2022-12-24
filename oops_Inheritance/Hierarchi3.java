package oops_Inheritance;
//Hierarchical Inheritance 

//This is sub/child class 2

public class Hierarchi3 extends Hierarchi1 {
	public void statement() {
		System.out.println("i can download statement");
	}

	public static void main(String[] args) {
		Hierarchi3 obj = new Hierarchi3();
		obj.login();
		obj.statement();

	}
}
