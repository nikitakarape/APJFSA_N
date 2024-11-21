package javaProject1;

import java.util.Scanner;

public class LargestElementInArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Get the size of the array
		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		// Declare and initialize the array
		int[] array = new int[size];

		// Read the elements of the array
		System.out.println("Enter " + size + " elements:");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}

		// Find the largest element
		int largest = array[0];
		for (int i = 1; i < size; i++) {
			if (array[i] > largest) {
				largest = array[i];
			}
		}

		// Print the largest element
		System.out.println("The largest element in the array is: " + largest);

		// Close the scanner
		scanner.close();
	}
}

/* Output:
Enter the size of the array: 3
Enter 3 elements:
23 70 90
The largest element in the array is: 90
 */


