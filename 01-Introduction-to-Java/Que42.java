/*Question 42: Write a Java program to check whether a person is eligible to vote.
Asked In Basic program
Input:
Age = 19

Output:
Eligible to Vote

Explanation:
The minimum voting age is 18 years.
If age ? 18, the person is eligible.*/

import java.util.*;

public class Que42{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your Age: ");
		int N = sc.nextInt();
		
		String msg = ( N >= 18)? "Eligible to vote" : "Not Eligible to vote";
		System.out.println(msg);
	}
}