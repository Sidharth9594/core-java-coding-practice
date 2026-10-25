/*Question 30: Write a java program to enter month number between(1-12) and print number of days in month using if else. How to print the number of days in a given month using if else in java programming
Asked In Just Practice assignment
Input:
Month = 2

Output
28 or 29 Days

Explanation:
January, March, May, July, August, October, December ? 31 days

April, June, September, November ? 30 days

February ? 28 days (29 in leap year)*/

import java.util.*;

public class Que30{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Month: ");
		int M = sc.nextInt();
		
		if ((M == 1) || (M == 3) || (M == 5) || (M == 7) || (M == 8) || (M == 10) || (M == 12)){
			System.out.println("31 Days");
		} else if ((M == 4) || (M == 6) || (M == 9) || (M == 11)){
			System.out.println("30 Days");
		} else if (M == 2){
			System.out.println("28 or 29 Days");
		} else 
			System.out.println("Enter the valid month");
	}
}