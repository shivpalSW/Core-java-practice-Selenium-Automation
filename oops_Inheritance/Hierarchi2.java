package oops_Inheritance;
//Hierarchical Inheritance 
//This is sub/child class 1

public class Hierarchi2 extends Hierarchi1{
	
	public void moneytransfer(){
		System.out.println("i can transfer money");
		
	}
	public static void main(String[] args) {
		Hierarchi2 obj = new Hierarchi2();
		obj.login();
		obj.moneytransfer();
	}

}
