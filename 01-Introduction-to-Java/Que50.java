/*Question 50: Write a Java program to check whether the absolute difference between two numbers is greater than 10.
Asked In Basic program
Input:
m = 25
n = 12

Output:
Difference is greater than 10

Explanation:
Absolute difference = |25 ? 12| = 13.
Since 13 is greater than 10, the condition is true.*/

import java.util.*;

public class Que50{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of M and N: ");
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int Abs_diff = Math.abs(M - N);
		
		String msg = Abs_diff > 10 ? "Difference is greater than 10" : "Difference is not greater than 10" ;
		System.out.println(msg);
	}
}