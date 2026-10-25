/*Question 8: Write a Java program to check whether a year is a leap year or not.
Asked In Just Practice assignment
Input:
Year = 2024

Output:
Leap Year

Explanation:
A year is leap if:

Divisible by 4

Not divisible by 100 unless divisible by 400*/

import java.util.*;

public class Que8{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Year: ");
		int N = sc.nextInt();
		
		if (N % 400 == 0 || N % 4 == 0 && N % 100 !=00){
			System.out.println("Leap year");
		} else {
			System.out.println("Not a leap year");
		}
	}
}