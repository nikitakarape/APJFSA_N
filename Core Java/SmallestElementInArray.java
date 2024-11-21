package javaProject1;

import java.util.Scanner;

public class SmallestElementInArray {
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

		// Find the smallest element
		int smallest = array[0];
		for (int i = 1; i < size; i++) {
			if (array[i] < smallest) {
				smallest = array[i];
			}
		}

		// Print the smallest element
		System.out.println("The smallest element in the array is: " + smallest);

		// Close the scanner
		scanner.close();
	}
}
/* Output:
Enter the size of the array: 3
Enter 3 elements:
23 45 10
The smallest element in the array is: 10
 */