package methodcall_singleclass;//Live session example    28/7/2020
//****  Making a method call from different classes*****
//CASE = 2
public class ClassOne {
	
	public static void methodone() {  //Static method
		System.out.println("Method one execution of classOne");
	}
	
	public void methodtwo() {  //Non-Static method 1
		System.out.println("Method two execution of ClassOne"); 
	}
	
	public void methodthree() {  //Non-Static method 2
		System.out.println("Method three execution of ClassOne"); 
	}


}
