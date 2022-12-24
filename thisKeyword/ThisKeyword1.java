package thisKeyword;

public class ThisKeyword1 {

	ThisKeyword1() { 
			System.out.println("hello ");
		}

	ThisKeyword1(int x) {
			this();
			System.out.println(x);
		}
	
		public static void main(String args[]) {
			ThisKeyword1 a = new ThisKeyword1(10);
		}
	}


