/*Question 18: Write a java program to find the first and last digit of a number.
Asked In Just Practice assignment
Input:

Number = 1234

Output:

First Digit = 1
Last Digit = 4

Explanation:

Last digit is found using number % 10.
First digit is found by dividing the number until it becomes a single digit.*/

import java.util.*;

public class Que18{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number: ");
		int n = sc.nextInt();
		
		int LastDigit = n % 10;
		
		while (n >= 10){
			n = n / 10;
		}
		int FirstDigit = n;
		
		System.out.println("First Digit: "+FirstDigit);
		System.out.println("Last Digit: "+LastDigit);
	}
}