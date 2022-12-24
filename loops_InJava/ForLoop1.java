package loops_InJava;

public class ForLoop1 {

	public static void main(String[] args) {
		
		 /*Syntax:=
				 for(Initialization(1); Condition(2); Increment/Decrement(4)) {
					 
					Statement or Executable code(3)
					
				 }        Note--> It will iterate through loop as per given sequence 1--2--3--4
				 			
				 			Initialization -->Condition-->Executable code-->Increment/Decrement
				 */
		
//--------------------------------------------------------------------------------------
                                                                                       
                                                                                       																
				for(int i=1; i<=10; i++) 			// increment
				{
					System.out.println(" Value of i is " + i);
				}
				
				System.out.println("Control came out from loop after increment");
		                  
//----------------------------------------------------------------------------------------
		
				for(int i=10; i>0; i--) 			// decrement        
				{
			    System.out.println(" Value of i is " +  i);
				}
				
				System.out.println("Control came out from loop after decrement");	
		}
	}
	


