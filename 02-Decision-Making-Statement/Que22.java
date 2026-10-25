/*Question 22: Write a java program to check whether a number is palindrome or not.
Asked In Just Practice assignment
Input:
Number = 121

Output
Palindrome Number

Explanation:
Reverse of 121 is 121.
Since original number equals reversed number, it is a Palindrome.*/

import java.util.*;

public class Que22{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number: ");
		int N = sc.nextInt();
		
		int a = N / 100;
		int b = (N / 10) % 10;
		int c = N % 10;
		
		int Rev = c * 100 + b * 10 + a;
		
		if (N == Rev){
			System.out.println("Palindrome Number");
		} else 
			System.out.println("Not a palindrome number");
	}
}