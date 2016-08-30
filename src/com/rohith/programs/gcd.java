package com.rohith.programs;

import java.util.Scanner;

public class gcd {
	public static void gcd1(int x, int y) {
		int c;
		c = x % y;

		if (c == 0)
			System.out.println(y + " is the gcd of two numbers");
		else
			gcd1(y, c);

	}

	/**
	 * This function calls the gcd function.
	 */
	public static void main(String[] args) {
		System.out.println("Enter two numbers:");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		gcd1(x, y);

	}

}
