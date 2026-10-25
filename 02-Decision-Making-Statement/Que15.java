/*Question 15: Write a java program to find the minimum between two numbers.
Asked In Just Practice assignment
Input:
Number1 = 8
Number2 = 12

Output
Minimum number = 8

Explanation:
Compare both numbers using if-else.
The smaller value is printed as minimum.*/

import java.util.*;

public class Que15{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number1: ");
		int a = sc.nextInt();
		System.out.print("Number1: ");
		int b = sc.nextInt();
		
		if (a > b){
			System.out.println("Minimum Number: "+b);
		} else 
			System.out.println("Minimum NUmber: "+a);
	}
}