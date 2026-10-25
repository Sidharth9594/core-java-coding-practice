/*Question 22: Write a Java program to find the first and last digit of a three-digit number without using a loop.
Asked In Basic program
Input:
456

Output:
First = 4
Last = 6

Explanation:
The first digit is obtained by dividing the number by 100.
The last digit is obtained using the modulus operator (% 10).*/

import java.util.*;

public class Que22{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number(Only 3 Digit) : ");
		int N = sc.nextInt();
		
		int First = N / 100;
		int Last = N % 10;
		
		System.out.println("First : "+First);
		System.out.println("Last : "+Last);
	}
}