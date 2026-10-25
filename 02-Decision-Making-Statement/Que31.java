/*Question 31: Write a java program to input week number(1-7) and print the corresponding day of week name using if else. How to print day of week using if else in java programming.
Asked In Just Practice assignment
Input:
Week Number = 3
Output:
Wednesday

Explanation:
If week number is:
1 ? Monday
2 ? Tuesday
3 ? Wednesday
4 ? Thursday
5 ? Friday
6 ? Saturday
7 ? Sunday

If the input is not between 1–7, print Invalid Week Number.*/

import java.util.*;

public class Que31{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Week Number: ");
		int N = sc.nextInt();
		
		if (N == 1){
			System.out.println("Monday");
		} else if (N == 2){
			System.out.println("Tuesday");
		} else if (N == 3){
			System.out.println("Wednesday");
		} else if (N == 4){
			System.out.println("Thursday");
		} else if (N == 5){
			System.out.println("Friday");
		} else if (N == 6){
			System.out.println("Saturday");
		} else if (N == 7){
			System.out.println("Sunday");
		} else 
			System.out.println("Enter valid Number of day");
	}
}