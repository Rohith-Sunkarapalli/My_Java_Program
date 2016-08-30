package com.rohith.programs;
import java.util.Scanner;

public class Palindrome {
	 
	 public static void palindromeCheck(String i) 
     {
		 String a,b;
		 b = i;
    	int x = i.length();
    	int n=0;
    	while(x>=0)
    	{ 
    		 a[n]= i[x];
    		x--;
    		n++;
    	}
    	if(a[] == b[])
    	{
    		System.out.println(i+" is a palindrome.");
    	}
    	else
           System.out.println(i+" is not a palindrome");
     }
	
	public static void main(String[] args) {
		System.out.println("enter a number");
        Scanner Scan = new Scanner(System.in);
        String i = Scan.nextLine();
        palindromeCheck(i);
    }

}
