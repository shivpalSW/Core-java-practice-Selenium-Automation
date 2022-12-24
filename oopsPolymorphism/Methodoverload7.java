package oopsPolymorphism;

public class Methodoverload7 {
	

	public void sum (int a, long b) {
		
		System.out.println(a + b);
	}
	
	public void sum (long a, int b) {
		System.out.println(a + b);
	}
	
	public static void main(String[] args) {
		Methodoverload7 obj = new Methodoverload7();
		//obj.sum(20, 20);  //Ambiguity 
		
	}
}
	


