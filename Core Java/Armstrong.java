package javaProject1;

import java.util.Scanner;
public class Armstrong 
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt user to enter a number
		System.out.print("Enter a number to check if it's an Armstrong number: ");
		int number = scanner.nextInt();

		// Store the original number to compare later
		int originalNumber = number;

		// Calculate the number of digits in the given number
		int numDigits = String.valueOf(number).length();

		// Initialize sum of powers to zero
		int armstrongSum = 0;

		// Process each digit of the number
		while (number != 0) {
			// Extract the last digit of the number
			int digit = number % 10;

			// Raise the digit to the power of 'numDigits' and add to the sum
			armstrongSum += Math.pow(digit, numDigits);

			// Remove the last digit from the number
			number /= 10;
		}

		// Check if the calculated sum is equal to the original number
		if (armstrongSum == originalNumber) {
			System.out.println(originalNumber + " is an Armstrong number.");
		} else {
			System.out.println(originalNumber + " is not an Armstrong number.");
		}

		// Close the scanner
		scanner.close();
	}
}
/*
Enter a number to check if it's an Armstrong number: 8
8 is an Armstrong number.
 */

