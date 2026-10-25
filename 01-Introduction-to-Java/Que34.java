/*Question 34: Write a Java program to check whether a number is positive, negative, or zero.
Asked In Basic program
Input:
Number = -8

Output:
Negative

Explanation:
If number > 0 ? Positive
If number < 0 ? Negative
If number = 0 ? Zero*/

import java.util.*;

public class Que34{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number : ");
		int N = sc.nextInt();
		
		String msg = (N > 0) ? "Positive Number" : (N < 0) ? "Negative Number" : "Zero";
		System.out.println(msg);
	}
}