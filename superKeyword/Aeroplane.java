package superKeyword;
//Sub class  17/8/2020
public class Aeroplane extends Train { //sub class extending Train class with inheritance
	
	  
	   
	    public void display()  { 
	    	 int planemaxSpeed = 1800; // Local variable
	    	
	        //int c = super.trainmaxSpeed;   
	        		
	    	System.out.println("This is a methhod of superclass\n");
	    	
	    	/* printing maxSpeed of sub class (Aeroplane) by using printing statement */
	    	System.out.println("Aeroplane max speed is : "  + planemaxSpeed);
	    	
	    	/* printing maxSpeed of base class (Train) by using super keyword*/
	    	//1st way to print instance variable 
	        System.out.println("Train Max Speed  is    : "  + super.trainmaxSpeed);
	        
	        //System.out.println(c);  /*This is 2nd way to print instance variable*/
	    } 
	      
	} 
	  


