package com.rohith.programs;
import java.util.Scanner;

public class Palindrome {
	 /* In this function a string is taken as input and checked
	   whether it is palindrome or not */
	 public static int checkForPalindrome(char[] input) 
     {
		
    	int low=0,high;
        int length= input.length;
    	high=length-1;
    	while(low<=high)
    	{
    		if(input[low]==input[high])
    		{
    			low++;
    			high--;
    		}
    		else
    		{
    		System.out.println("given string is not a palindrome.");
    		return 0;
    		}
    		}
    	System.out.println("given string is palindrome");
    	return 1;
     }
	/*In the main function we are taking the user input string 
	 * and passing it to checkForPalindrome function.
	 */
	 
	public static void main(String[] args) {
		System.out.println("enter a number");
        Scanner Scan = new Scanner(System.in);
        char[] input = Scan.next().toCharArray();
        checkForPalindrome(input);
    }

}
