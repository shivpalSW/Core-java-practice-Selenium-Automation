package oops_Interface;

public class Phonpe2 implements FunctionDetails2, FunctionDetails3 {

	public void upi() {
		int i = 123456;
		System.out.println("This is UPI no for Phonpe        : " + i);
	}

	public void mobileNo() {
		long l = 987456321l;
		System.out.println("This is Mobile  no for Phonpe    : " + l);
	}

	public void adharCardNo() {
		long b = 912457896321l;
		System.out.println("This is adhar card no for Phonpe : " + b);
	}

	public void panNo() {

		System.out.println("This is PAN card no for Phonpe   : 9BB463255");
	}

	public static void main(String[] args) {
		Phonpe2 obj = new Phonpe2();
		obj.upi();
		obj.mobileNo();
		obj.adharCardNo();
		obj.panNo();

	}
}
