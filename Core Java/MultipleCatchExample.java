//Write Java Exception Handling program  using  multiple catch block with comment.
package javaProject1;

public class MultipleCatchExample {

	public static void main(String[] args) {
		try {
			// Example 1: ArithmeticException - Division by zero
			int result = 10 / 0;  // This will throw ArithmeticException

			// Example 2: ArrayIndexOutOfBoundsException - Invalid index access
			int[] arr = new int[5];
			arr[10] = 100;  // This will throw ArrayIndexOutOfBoundsException

			// Example 3: NullPointerException - Calling method on a null object
			String str = null;
			int length = str.length();  // This will throw NullPointerException

		} 
		// Catch block for handling ArithmeticException
		catch (ArithmeticException e) {
			// Prints a message when an ArithmeticException occurs
			System.out.println("Caught ArithmeticException: " + e.getMessage());
		} 
		// Catch block for handling ArrayIndexOutOfBoundsException
		catch (ArrayIndexOutOfBoundsException e) {
			// Prints a message when an ArrayIndexOutOfBoundsException occurs
			System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
		}
		// Catch block for handling NullPointerException
		catch (NullPointerException e) {
			// Prints a message when a NullPointerException occurs
			System.out.println("Caught NullPointerException: " + e.getMessage());
		} 
		// Catch block for any other Exception that wasn't specifically handled above
		catch (Exception e) {
			// Prints a message for any other type of exception
			System.out.println("Caught an unknown exception: " + e.getMessage());
		}

		// This statement will always be executed after exception handling
		System.out.println("Program continues after exception handling.");
	}
}
/* Output:
Caught ArithmeticException: / by zero
Program continues after exception handling.
*/


