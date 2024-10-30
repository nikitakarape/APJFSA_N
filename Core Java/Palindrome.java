package javaProject1;


import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input from the user
		System.out.print("Enter a number: ");
		int n = scanner.nextInt();

		// Storing original number to compare number
		int original = n;
		int reverse = 0;

		// Reversing the number
		while (n > 0) {
			int remainder = n % 10;
			reverse = (reverse * 10) + remainder;
			n = n / 10;
		}

		// Checking if the original number is equal to its reverse
		if (original == reverse) {
			System.out.println("The number is a palindrome.");
		} else {
			System.out.println("The number is not a palindrome.");
		}

		scanner.close();
	}
}
/* OutPut:
Enter a number: 1221
The number is a palindrome.
*/	









