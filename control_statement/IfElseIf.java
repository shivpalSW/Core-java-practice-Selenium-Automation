package control_statement;

	// If else If
	// 4. Std. Syntax of If else If Statement
	//	if(condition_1) {
	//		   /if condition_1 is true execute this/
	//		   statement(s);
	//		}
	//		else if(condition_2) {
	//		   /* execute this if condition_1 is not met and
	//		    * condition_2 is met
	//		    */
	//		   statement(s);
	//		}
	//		else if(condition_3) {
	//		   /* execute this if condition_1 & condition_2 are
	//		    * not met and condition_3 is met
	//		    */
	//		   statement(s);
	//		}
	//		.
	//		.
	//		.
	//		else {
	//		   /* if none of the condition is true
	//		    * then these statements gets executed
	//		    */
	//		   statement(s);
	//		}
public class IfElseIf {

	public static void main(String[] args) {
	
			int marks = 77;
			
			
			if (marks>=65) {
				System.out.println("Distinction");
			}
			else if(marks >=60 && marks <65) {
				System.out.println("1st class");
			}
			else if(marks >=55 && marks <60) {
				System.out.println("2nd class");
			}
			
			else if(marks >=35 && marks <55) {
				System.out.println("Pass");
			}
			
			else {
				System.out.println("Fail");
			}
		}

	}


