package javaProject1;


import java.util.Scanner;

public class NarrowingTypeCasting {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter a double value
		System.out.print("Enter a double value: ");
		double userDouble = scanner.nextDouble();

		// Narrowing typecasting from double to int
		int userInt = (int) userDouble;

		// Output the results

		System.out.println("Narrowed int value: " + userInt);

		// Close the scanner
		scanner.close();
	}
}
/*
Enter a double value: 9.78
Narrowed int value: 9
 */



