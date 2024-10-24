package javaProject1;

import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// prompt user for the length of the side of the square
		System.out.print("Enter the length of the side of the square: ");
		double side = scanner.nextDouble();

		// Calculate the area and perimeter
		double area = side * side;
		double perimeter = 4 * side;

		// Display the results
		System.out.println("Area of the square: " + area);
		System.out.println("Perimeter of the square: " + perimeter);

		scanner.close();
	}
}

/*
 Enter the length of the side of the square: 60
 Area of the square: 3600.0
 Perimeter of the square: 240.0

 */


























