/*Question 29: Write a Java program to find quotient and remainder using arithmetic operators.
Asked In Basic program
Input:
Dividend = 20
Divisor = 3

Output:
Quotient = 6
Remainder = 2

Explanation:
The division operator (/) gives the quotient.
The modulus operator (%) gives the remainder.*/

import java.util.*;

public class Que29{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Dividend : ");
		int A = sc.nextInt();
		System.out.print("Divisor : ");
		int B = sc.nextInt();
		
		int C = A / B;
		int D = A % B;
		
		System.out.println("Quotient : "+C);
		System.out.println("Remainder : "+D);
	}
} 