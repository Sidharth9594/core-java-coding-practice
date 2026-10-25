/*Question 19: Given a score out of 100, print Excellent (?90), Good (?75), Average (?50), Poor (< 50) — using nested ternary operators.
Asked In Just Practice assignment
Input:
Score = 82

Output:
Good

Explanation:
82 is greater than 75 but less than 90, so the grade is "Good".
Nested ternary operators are used instead of multiple if-else statements.*/

import java.util.*;

public class Que19{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("score(Out of 100): ");
		int N = sc.nextInt();
		
		if (N >= 90){
			System.out.println("Excellent");
		} else if(N >= 75){
			System.out.println("Good");
		} else if (N >= 50){
			System.out.println("Average");
		} else
			System.out.println("Poor");
	}
}