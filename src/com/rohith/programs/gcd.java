package com.rohith.programs;

import java.util.Scanner;
//This functions takes two numbers as input and finds the gcd of those two numbers
public class gcd {
	
	public static void  findGcdOf(int FirstNumber, int SecondNumber) {
		int Remainder;
		Remainder = FirstNumber% SecondNumber;

		if (Remainder == 0)
			System.out.println(SecondNumber+ " is the gcd of two numbers");
		else
			findGcdOf(SecondNumber,Remainder);

	}

	/**
	 * This function takes two numbers from user and calls the findGcdOf function.
	 */
	public static void main(String[] args) {
		System.out.println("Enter two numbers:");
		Scanner scan = new Scanner(System.in);
		int FirstNumber = scan.nextInt();
		int SecondNumber= scan.nextInt();
		findGcdOf(FirstNumber,SecondNumber);

	}

}
