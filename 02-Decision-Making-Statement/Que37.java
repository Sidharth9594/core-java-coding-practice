/*Question 37: Write a Java program to compare two integers and determine whether the first number is greater than, smaller than, or equal to the second number.
Asked In Just Practice assignment
Input:
A = 25
B = 30

Output:
A is smaller than B

Explanation:
Use if-else to compare values.*/

import java.util.*;

public class Que37{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("A: ");
		int A = sc.nextInt();
		System.out.print("B: ");
		int B = sc.nextInt();
		
		if (A < B){
			System.out.println("A is smaller than B");
		} else if (A > B){
			System.out.println("A is greater than B");
		} else 
			System.out.println("A is equal to B");
	}
}