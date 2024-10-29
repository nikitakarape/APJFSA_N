package javaProject1;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter a Number
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		// Using the conditional operator to check even or odd
		String result = (number % 2 == 0) ? "Even" : "Odd";

		System.out.println("The number " + number + " is " + result + ".");

		scanner.close();
	}
}
/*
Enter a number: 60
The number 60 is Even.
 */



