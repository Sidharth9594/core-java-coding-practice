/*Question 45: Write a Java program to find the minimum between two numbers.
Asked In Basic program
Input:
A = 8
B = 12

Output:
Minimum = 8

Explanation:
The program compares both numbers and prints the smaller one.*/

import java.util.*;

public class Que45{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input: ");
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		String msg = (A > B) ? "Minimum: "+B : "Minimum: "+A;
		System.out.println(msg);
	}
}