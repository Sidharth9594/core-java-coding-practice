/*Question 11: Write a java program to find a maximum between three numbers.
Asked In Just Practice assignment
Input:
Number1 = 25
Number2 = 40
Number3 = 32

Output
Maximum number = 40

Explanation:
The program compares all three numbers using conditional statements.
If Number1 is greater than Number2 and Number3, then it is maximum.
Otherwise, compare Number2 and Number3 to find the largest value.*/

import java.util.*;

public class Que11{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number1: ");
		int a = sc.nextInt();
		System.out.print("Number2: ");
		int b = sc.nextInt();
		System.out.print("Number3: ");
		int c = sc.nextInt();
		
	if (a > b && a > c){
		System.out.println("Maximum number: "+a);
	} else if (b > a && b > c){
		System.out.println("Maximum number: "+b);
	} else 
		System.out.println("Maximum number: "+c);
	}
}