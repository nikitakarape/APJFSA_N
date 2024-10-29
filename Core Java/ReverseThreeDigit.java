package javaProject1;
import java.util.Scanner;

public class ReverseThreeDigit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a 3-digit number: ");
		int number = scanner.nextInt();

		if (number >= 100 && number <= 999) {  
			// Check if it's a 3-digit number
			int reversedNumber = 0;
			while (number != 0) {
				int digit = number % 10;
				reversedNumber = reversedNumber * 10 + digit;
				number /= 10;
			}
			System.out.println("Reversed Number: " + reversedNumber);
		} else {
			System.out.println("Please enter a 3-digit number.");
		}
		scanner.close();
	}
}
/*
Enter a 3-digit number: 123
Reversed Number: 321
 */

