/*Question 12: Write a java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote.
Asked In Just Practice assignment
Input:
Age = 18

Output
Eligible to vote

Explanation:
According to voting rules, a person must be at least 18 years old to vote.
If age ? 18 ? Eligible
Otherwise ? Not EligibleQuestion */

import java.util.*;

public class Que12{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Age: ");
		int N = sc.nextInt();
		
		if (N >= 18){
			System.out.println("eligible to Vote");
		} else 
			System.out.println("Not Eligible to Vote");
	}
}