/*Question 23: Write a java program to Check Number Is Spy Number or Not.
Example : A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
Asked In Just Practice assignment
Input:
Number = 1412

Output
Spy Number

Explanation:
Sum = 1 + 4 + 1 + 2 = 8
Product = 1 * 4 * 1 * 2 = 8
Since sum = product = 8, it is a Spy Number.*/

import java.util.*;

public class Que23{
	public static void main(String x[]){
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Number:");
		int N = sc.nextInt();
		
		int a = N / 1000;
		int b = ( N / 100 )%10;
		int c = ( N/ 10 )%10;
		int d = N % 10;
		
		int sum = a + b + c + d;
		int mult = a * b * c * d;
		
		if (sum == mult){
			System.out.println("Spy Number");
		} else 
			System.out.println("Not a spy number");
	}
}