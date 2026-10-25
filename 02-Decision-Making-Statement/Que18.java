/*Question 18: Given a student’s score, print Pass if it’s 40 or above, otherwise print Fail.
Asked In Just Practice assignment
Input:
Score = 38

Output
Fail

Explanation:
If score ? 40 ? Pass
Otherwise ? Fail*/

import java.util.*;

public class Que18{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Score: ");
		int a = sc.nextInt();
		
		if (a >= 40){
			System.out.println("Pass");
		} else
			System.out.println("Fail");
	}
}