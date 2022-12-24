package oops_Inheritance;
//Hierarchical Inheritance 

//This is sub/child class 3

public class Hierarchi4 extends Hierarchi1 {

	public void balance() {

		System.out.println("i can check balance");
	}

	public static void main(String[] args) {
		Hierarchi4 obj = new Hierarchi4();
		obj.login();
		obj.balance();

	}
}
