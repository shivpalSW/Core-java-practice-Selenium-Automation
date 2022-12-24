package methodcall_singleclass; //28-7-2020
//CASE = 2
public class ClassTwo {

	public static void main(String[] args) {
		
		System.out.println("Main method of ClassTwo ");
		
		ClassOne obj = new ClassOne(); // Created an object of "classOne" to access that class related methods

		ClassOne.methodone(); // With the help of class name we can call static method
								// Syntax = parent ClassName.metodName

		obj.methodtwo(); // Non static method call by creating object of first class in second class

		obj.methodthree(); // Non static method call by creating object of first class in second class

		ClassTwo obj1 = new ClassTwo();// Created an object of "classTwo" to access class related methods
		obj1.methodFour();
		obj1.methodFive();
	}
	public void methodFour() { //Non-Static method 3
		System.out.println("Method Four execution of ClassTwo");
	}

	public void methodFive() { //Non-Static method 4
		System.out.println("Method Five execution of ClassTwo");
	}
}
