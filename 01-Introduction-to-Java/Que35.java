/*Question 35: Write a Java program to check whether a number is divisible by both 5 and 11.
Asked In Basic program
Input:
Number = 55

Output:
Divisible by 5 and 11

Explanation:
A number divisible by both 5 and 11 must give remainder 0 when divided by 5 and 11.*/

import java.util.*;

public class Que35{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Number : ");
		int N = sc.nextInt();
		
		String msg = (N % 5 == 0 && N % 11 == 0) ? "Divisible by 5 and 11" : "Not Divisible by 5 and 11";
		System.out.println(msg);
	}
}