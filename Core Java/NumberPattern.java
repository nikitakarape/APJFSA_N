package javaProject1;

public class NumberPattern {
	public static void main(String[] args) {
		// Define the number of rows for the pattern
		int rows = 5;

		// Outer loop to handle the number of rows
		for (int i = 1; i <= rows; i++) {
			// Inner loop to print numbers from 1 up to the current row number
			for (int j = 1; j <= i; j++) {
				// Print the current number without a newline
				System.out.print(j);
			}
			// Move to the next line after each row is completed
			System.out.println();
		}
	}
}


/* OutPut:
1
12
123
1234
12345
 */	



