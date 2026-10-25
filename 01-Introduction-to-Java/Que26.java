/*Question 26: Write a Java program to check whether a number is a Spy number.
Asked In Basic program
Input:
1412

Output:
Spy Number

Explanation:
A Spy number is a number where the sum of digits equals the product of digits.
Sum = 1 + 4 + 1 + 2 = 8
Product = 1 * 4 * 1 * 2 = 8.*/

import java.util.*;

public class Que26{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number(only 4 digits) : ");
		int N = sc.nextInt();
		
		int A = N / 1000;
		int B = ( N / 100) % 10;
		int C = ( N / 10 ) % 10;
		int D = N % 10;
		
		int Sum = A + B + C + D;
		int Product = A * B * C * D;
		
		System.out.println("Sum : "+Sum);
		System.out.println("Product : "+Product);
		
		String msg = Sum == Product ? "It Is Spy Number " : "It is not a spy number";
		System.out.println(msg);
	}
}