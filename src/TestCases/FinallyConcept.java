package TestCases;

public class FinallyConcept {

	public static void main(String[] args) {
		//test1();
		//test2();
		//division();
		division1();

	}
	public static void test1() {
		try {
			System.out.println("Inside test1 method");
			throw new RuntimeException("test");
		}catch(Exception e) {
			System.out.println("Inside catch block");

			
		}
		finally 
		{
			System.out.println("Inside finally block");

		}
	}
	
	//
	public static void test2() {
		try {
			System.out.println("Inside test2");

			
		}
		finally {
			System.out.println("finally code in  test2 method");

		}
	}
	
//	//
//	public static void division() {
//		int i=10;
//		try {
//			System.out.println("Inside try block");
//			int k=i/0;
//
//		}
//		catch(ArithmeticException e) {
//			System.out.println("Inside catch block");
//			System.out.println("divide by zero error");
//
//
//		}
//		finally {
//			System.out.println("execute this code even after any exception");
//
//		}
//	}
	//
	public static void division1() {
		int i=10;
		try {
			System.out.println("Inside try block");
			int k=i/0;

		}
		catch(NullPointerException e) {
			System.out.println("Inside catch block");
			System.out.println("divide by zero error");


		}
		finally {
			System.out.println("execute this code even after any exception");

		}
		
		
		
		
		
	}

}
