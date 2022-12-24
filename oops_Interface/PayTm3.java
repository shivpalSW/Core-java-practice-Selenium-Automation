package oops_Interface;

public class PayTm3 implements FunctionDetails3 {
	
	public void upi() {
		int i = 123456;
		System.out.println("This is UPI no for Paytm        : " + i);
	}

	public void mobileNo() {
		long l = 987456321l;
		System.out.println("This is Mobile  no for Paytm    : " + l);
	}

	public void adharCardNo() {
		long b = 912457896321l;
		System.out.println("This is adhar card no for Paytm : " + b);
	}

	public void panNo() {

		System.out.println("This is PAN card no for Paytm   : 9BB463255");
	}

	public static void main(String[] args) {
		PayTm3 obj = new PayTm3();
		obj.upi();
		obj.mobileNo();
		obj.adharCardNo();
		obj.panNo();
}
}