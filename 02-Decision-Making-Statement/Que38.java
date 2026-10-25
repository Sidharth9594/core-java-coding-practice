/*Question 38: Write a Java program to check whether a given month number is valid and display the corresponding season.
Asked In Just Practice assignment
Input:
Month Number = 4
Output:
Season: Spring

Explanation:
The program checks the month number and maps it to a season as follows:
December (12), January (1), February (2) : Winter
March (3), April (4), May (5) : Spring
June (6), July (7), August (8) : Summer
September (9), October (10), November (11) : Autumn*/

import java.util.*;

public class Que38{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Month Number: ");
		int m = sc.nextInt();
		
		if (m == 12 || m == 1 || m == 2){
			System.out.println("Season: Winter");
		} else if (m >= 3 && m <= 5){
			System.out.println("Season: Spring");
		} else if (m >= 6 && m <= 8){
			System.out.println("Season: Summer");
		} else if (m >= 9 && m <= 11){
			System.out.println("Season: Autumn");
		} else 
			System.out.println("Enter a Valid Month");
	}
}