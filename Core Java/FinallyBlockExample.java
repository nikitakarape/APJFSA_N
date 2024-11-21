//Write Java Exception Handling program  using finally block.
package javaProject1;


public class FinallyBlockExample {

	public static void main(String[] args) {
		// Try block contains code that may cause an exception
		try {
			System.out.println("Inside the try block.");
			int result = 10 / 0;  // This line will throw an ArithmeticException 
		} 
		// Catch block will handle the ArithmeticException
		catch (ArithmeticException e) {
			System.out.println("Exception caught: " + e);
		} 
		// Finally block is always executed( an exception was thrown or not)
		finally {
			// Prints a message indicating that the finally block is being executed
			System.out.println("This is the finally block. It is always executed.");
		}

		// This statement will still execute after the try-catch-finally block
		System.out.println("Program continues after the finally block.");
	}
}
/* Output:
Inside the try block.
Exception caught: java.lang.ArithmeticException: / by zero
This is the finally block. It is always executed.
Program continues after the finally block.
 */

