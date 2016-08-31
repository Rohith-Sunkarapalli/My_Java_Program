package com.rohith.programs;
import java.util.Scanner;
public class Prime {
	//It takes a number as input and checks whether it is prime or not
		public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner Scan = new Scanner(System.in);
		int Number = Scan.nextInt();
		int count =0;
		for(int Iteration=1;Iteration<=Number;Iteration++)
		{
			if(Number%Iteration==0)
			{
					count++;
			}
			
		}
			if(count==2)
						System.out.println(Number+" is a prime number");	
			else
				 System.out.println(Number+"is not a prime number");
		}

	}



