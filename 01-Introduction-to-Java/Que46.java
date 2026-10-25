/*Question 46: Write a Java program to find the minimum among three numbers.
Asked In Basic program
Input:
A = 6
B = 3
C = 9

Output:
Minimum = 3

Explanation:
The program compares all three numbers using conditional statements and prints the smallest value.*/

import java.util.*;

public class Que46{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input(3 numbers): ");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		String msg = (B > A && C > A) ? "Minimum: "+A : (A > B && C > B) ? "Minimum: "+B : "Minimum: "+C;
		System.out.println(msg);
	}
}