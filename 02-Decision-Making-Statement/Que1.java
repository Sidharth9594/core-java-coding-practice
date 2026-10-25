/*Question 1: Write a Java program to check whether a number is even or odd.
Asked In Just Practice assignment
Input:
Number = 8

Output:
Even

Explanation:
If a number is divisible by 2, it is Even. Otherwise, it is Odd.*/

import java.util.*;

public class Que1{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number: ");
		int N = sc.nextInt();
		
		if (N % 2 == 0){
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
}