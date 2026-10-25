/*Question 53: Write a Java program to print the larger digit between first and last digit of a three-digit number.
Asked In Basic program
Input:
Number = 582

Output:
Larger Digit = 5

Explanation:
First digit = 5
Last digit = 2
Since 5 > 2, the larger digit is 5*/

import java.util.*;

public class Que53{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number(3 digits): ");
		int N = sc.nextInt();
		
		int Last = N % 10;
		
		int A = N / 10;
		int First = A / 10;
		
		int msg = First > Last ? First : Last;
		System.out.println("Larger Digit: "+msg);
	}
}