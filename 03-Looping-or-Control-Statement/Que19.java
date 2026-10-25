/*Question 19: Write a java program to find the sum of the first and last digit of a number.
Asked In Just Practice assignment
Input:

Number = 1234

Output:

Sum = 5

Explanation:

First digit = 1
Last digit = 4
Sum = 1 + 4 = 5.
*/

import java.util.*;

public class Que19{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number: ");
		int n = sc.nextInt();
		
		int LastDigit = n % 10;
		
		while (n >= 10){
			n = n / 10;
		}
		int FirstDigit = n;
		
		int sum = FirstDigit + LastDigit;
		System.out.println("First Digit: "+FirstDigit);
		System.out.println("Last Digit: "+LastDigit);
		System.out.println("Sum :"+sum);
	}
}