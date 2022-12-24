package methodcall_singleclass;  //Live session example    28/7/2020
//****  Making a method class within a single class*****
//case = 1
public class Methodcallsingle {

	public static void main(String[] args) {  // Main method
		
		Methodcallsingle obj = new Methodcallsingle();
		//Methodcallsingle.methodone(); // By using class name we can call static method
		methodone();
		obj.methodtwo();
	}
	
	public static void methodone() {  //Static method
		System.out.println("Method one execution");
	}
	
	public void methodtwo() {  //Non-Static method
		System.out.println("Method two execution"); 
	}

}
