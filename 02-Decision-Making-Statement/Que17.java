/*Question 17: Write a java program to find the maximum between two numbers.
Asked In Just Practice assignment
Input:
Number1 = 45
Number2 = 30

Output
Maximum number = 45

Explanation:
If Number1 > Number2, print Number1.
Otherwise, print Number2.*/

import java.util.*;

public class Que17{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number1: ");
		int a = sc.nextInt();
		System.out.print("Number2: ");
		int b = sc.nextInt();
		
		if (a > b){
			System.out.println("Maximum Number: "+a);
		} else 
			System.out.println("maximum Number: "+b);
	}
}