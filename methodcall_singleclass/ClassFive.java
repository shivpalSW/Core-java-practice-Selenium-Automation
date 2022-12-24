package methodcall_singleclass;//Live session example    28/7/2020
//CASE = 4
//****  Making a method call with argument with different classes*****
//This example also an example of "Method Overloading"

public class ClassFive {

	public static void main(String[] args) {
		ClassFour.login(100,"Laptop");
		
		ClassFour obj = new ClassFour();
		obj.login(50);
		obj.login(100, 200);
		obj.login(300, 400, "Agile");

	}

}
