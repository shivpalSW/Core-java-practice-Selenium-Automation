package string_Class_Function;

public class StringFunctions1 {

	public static void main(String[] args) {
		
		String s1 = "Performance Testing";
		             //01234567891011-12-13141516171819
		String s2 = "framework";
		String s3 = "FRAMEWORK";
		String s4 = "framework";
		
		
		System.out.println(s1.isEmpty());
		System.out.println(s1.length());
		System.out.println(s1.startsWith("Perfo"));
		System.out.println(s3.endsWith("123"));
		System.out.println(s2.endsWith("work"));
		System.out.println(s2.toUpperCase());
		System.out.println(s3.toLowerCase());
		System.out.println(s1.concat( s2));
		System.out.println(s1.concat("is mandatory "));
		System.out.println(s1.indexOf("f"));  // following a indexing
		System.out.println(s1.lastIndexOf("e"));  // following a indexing
		System.out.println(s1.charAt(1));    // following a indexing
		System.out.println(s1.substring(3));  //index 3 and further characters of string we can get
		System.out.println(s1.substring(3, 15));  //words between 2 character index we can get
		System.out.println(s1.equals(s4));  //comparison of two strings
		System.out.println(s2.equals(s4));  //comparison of two strings
		System.out.println(s2.equalsIgnoreCase(s3));  // Forcefull equality operation
		

	}

}