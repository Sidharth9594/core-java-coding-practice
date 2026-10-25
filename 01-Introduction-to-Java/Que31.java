/*Question 31: Write a Java program to check whether a given number is even or odd.
Asked In Basic program
Input:
Number = 12

Output:
Even

Explanation:
A number is even if it is divisible by 2 (remainder 0).
If the remainder is not 0, the number is odd.*/

import java.util.*;

public class Que31{
	public static void main(String x[]){
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Number : ");
		int N = sc.nextInt();
		
		String msg = N % 2 == 0 ? "Even" : "Odd";
		System.out.println(msg);
	}
}