/*Question 25: Write a Java program to check whether a number is palindrome or not.
Asked In Basic program
Input:
121

Output:
Palindrome

Explanation:
A palindrome number remains the same when reversed.
Since 121 reversed is also 121, it is a palindrome.*/

import java.util.*;

public class Que25{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number : ");
		int N = sc.nextInt();
		
		int A = N % 10;
		int B = ( N / 10) % 10;
		int C = N / 100;
		
		int Total = A * 100 + B * 10 + C;
		
		System.out.println("String : "+Total);
		String msg = N == Total ? "It Is Palindrome" : "It Is Not A Palindrome";
		System.out.println(msg);
	}
}