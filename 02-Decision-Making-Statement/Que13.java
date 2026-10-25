/*Question 13: Write a java program to accept two integers and check whether they are equal or not.
Asked In Just Practice assignment
Input:
Number1 = 15
Number2 = 15

Output
Both numbers are equal

Explanation:
If Number1 == Number2, print equal.
Otherwise, print not equal.*/

import java.util.*;

public class Que13{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Number1: ");
		int a = sc.nextInt();
		System.out.print("Number1: ");
		int b = sc.nextInt();
		
		if (a == b){
			System.out.println("Both numbers are equal");
		} else
			System.out.println("Both numbers are not equal");
	}
}