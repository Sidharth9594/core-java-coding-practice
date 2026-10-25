/*Question 52: Write a Java program to check eligibility based on percentage and income.
Asked In Basic program
Input:
Percentage = 78
Income = 180000

Output:
Eligible

Explanation:
Eligibility condition:
Percentage ? 75 and Income < 200000.
Both conditions are satisfied.*/

import java.util.*;

public class Que52{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Percentage: ");
		int A = sc.nextInt();
		
		System.out.print("enter Income: ");
		int B = sc.nextInt();
		
		String msg = (A > 75 && B < 200000) ? "Eligible" : "Not Eligible";
		System.out.println(msg);
	}
}