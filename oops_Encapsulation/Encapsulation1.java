package oops_Encapsulation;

public class Encapsulation1 {

	private double balance;

	 public double  getbalance() {
		 
		// System.out.println("get balance method"); // printing statement will not work

		return balance;
	}

	public void setbalance(double balance) {

		this.balance = balance;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to ICICI bank");
		Encapsulation1 obj = new Encapsulation1();
		obj.setbalance(100000);
		System.out.println("Your account balance is : " + obj.getbalance());
	}

}
