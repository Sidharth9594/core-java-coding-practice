/*Question 14: Write a java program to check whether a number is palindrome or not.
Asked In Just Practice assignment
Input:

Number = 121

Output:

Palindrome

Explanation:

The reversed number of 121 is also 121.
Since original and reversed numbers are equal, it is a palindrome.*/

import  java.util.*;

public class Que14{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Number: ");
		int n = sc.nextInt();
		int m = n;
		int reversed = 0;
		
		while(n > 0){
			int digit = n % 10;
			reversed = reversed * 10 + digit;
			n = n / 10;
		}
		System.out.println("Reversed Number: "+reversed);
		
		if (m == reversed){
			System.out.println("It Is Palindrome");
		} else
			System.out.println("It Is Not a Palindrome");
	}
}