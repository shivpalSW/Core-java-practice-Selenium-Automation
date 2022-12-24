package loops_InJava;  //5/8/2020

public class NestedForLoop {

	public static void main(String[] args) {
		
				// for loop for k
				//		for(initialization;condition;incr/decr){  
				//			//code to be executed  
				//			}

				for ( int k = 1; k<=5; k++) {
					// for loop for m
					for (int m = 5; m>=k; m--) {
						System.out.print("  *  ");
					}
					System.out.println();	
				}

			}

		}
	


