/*Question 38: Write a Java program to check whether a given year is a leap year or not.
Asked In Basic program
Input:
Year = 2024

Output:
Leap Year

Explanation:
A leap year is divisible by 4.
However, if divisible by 100, it must also be divisible by 400 to be a leap year.*/

import java.util.*;

public class Que38{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Year: ");
		int N = sc.nextInt();
		
		String msg = (N % 4 == 0 && N % 100!= 0 || N % 400 == 0) ? "It Is Leap Year" : "It is not a leap year";
		System.out.println(msg);
	}
}