package javaProject1;
import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Determine the largest number using conditional checks
        int largest;
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        // Display the largest number
        System.out.println("The largest number is: " + largest);

        // Close the scanner
        scanner.close();
    }
}
/*
Enter the first number: 23
Enter the second number: 89
Enter the third number: 90
The largest number is: 90


 */
