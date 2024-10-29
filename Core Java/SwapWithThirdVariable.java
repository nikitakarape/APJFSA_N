package javaProject1;

public class SwapWithThirdVariable {
	public static void main(String[] args) {
		int a = 6;
		int b = 8;

		System.out.println("Before swapping: a = " + a + ", b = " + b);

		// Swapping using a third variable
		int temp = a;
		a = b;
		b = temp;

		System.out.println("After swapping: a = " + a + ", b = " + b);
	}
}
/*
Before swapping: a = 6, b = 8
After swapping: a = 8, b = 6
 */

