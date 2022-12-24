package oops_Interface;

public class Gpay1 implements FunctionDetails1, FunctionDetails2, FunctionDetails3 {

	public void upi() {
		int i = 123456;
		System.out.println("This is UPI no for Gpay1        : " + i);
	}

	public void mobileNo() {
		long l = 987456321l;
		System.out.println("This is Mobile  no for Gpay1    : " + l);
	}

	public void adharCardNo() {
		long b = 912457896321l;
		System.out.println("This is adhar card no for Gpay1 : " + b);
	}

	public void panNo() {

		System.out.println("This is PAN card no for Gpay1   : 9BB463255");
	}
	
	public static void main(String[] args) {
		Gpay1 obj = new Gpay1 ();
		obj.upi();
		obj.mobileNo();
		obj.adharCardNo();
		obj.panNo();
}
}
