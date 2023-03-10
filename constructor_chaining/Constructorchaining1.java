package constructor_chaining;
// Java program to illustrate Constructor Chaining 
// within same class Using this() keyword 

public class Constructorchaining1 {


	    // default constructor 1 
	    // default constructor will call another constructor 
	    // using this keyword from same class 
	Constructorchaining1() 
	    { 
	        // calls constructor 2 
	        this(5); 
	        System.out.println("The Default constructor"); 
	    } 
	  
	    // parameterized constructor 2 
	Constructorchaining1(int x) 
	    { 
	        // calls constructor 3 
	        this(5, 15); 
	        System.out.println(x); 
	    } 
	  
	    // parameterized constructor 3 
	Constructorchaining1(int x, int y) 
	    { 
	        System.out.println(x * y); 
	    } 
	  
	    public static void main(String args[]) 
	    { 
	        // invokes default constructor first 
	        new Constructorchaining1(); 
	    } 
	}

