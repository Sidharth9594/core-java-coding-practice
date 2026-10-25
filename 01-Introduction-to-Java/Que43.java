/*Question 43: Write a Java program to accept two integers and check whether they are equal.
Asked In Basic program
Input:
A = 50
B = 50

Output:
Equal

Explanation:
If both numbers have the same value, they are equal; otherwise, they are not equal.*/

import java.util.*;

public class Que43{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 2 numbers: ");
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		String msg = (A == B) ? "Equal" : "Not Equal";
		System.out.println(msg);
	}
}