/*Question 47: Write a Java program to find the maximum between two numbers.
Asked In Basic program
Input:
A = 14
B = 9

Output:
Maximum = 14

Explanation:
The program compares both numbers and prints the larger value.*/

import java.util.*;

public class Que47{
	public static void main(String X[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input(2 numbers): ");
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		String msg = A > B ? "Maximum: "+A :"Maximum: "+B;
System.out.println(msg);		
	}
}