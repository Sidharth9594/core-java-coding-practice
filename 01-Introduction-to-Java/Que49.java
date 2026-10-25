/*Question 49: Given marks out of 100, print grade using nested ternary operators.
Asked In Basic program
Input:
Marks = 82

Output:
Good

Explanation:
Grades are assigned based on marks range:
? 90 ? Excellent
? 75 ? Good
? 50 ? Average
< 50 ? Poor

Since 82 lies between 75 and 89, the grade is Good.*/

import java.util.*;

public class Que49{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Marks: ");
		int N = sc.nextInt();
		
		String msg = (N >= 90) ? "Excellent" : ( N >= 75) ? "Good" : (N >= 50) ? "Average" : "Poor";
		System.out.println(msg);
	}
}