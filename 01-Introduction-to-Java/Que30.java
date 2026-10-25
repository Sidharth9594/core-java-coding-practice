/*Question 30: Write a Java program to check whether a number is a multiple of both 3 and 5.
Asked In Basic program
Input:
15

Output:
Multiple of both 3 and 5

Explanation:
A number divisible by both 3 and 5 must give remainder 0 when divided by 3 and by 5.
The logical AND operator is used to check both conditions.*/

import java.util.*;

public class Que30{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int Num = sc.nextInt();
		
		String msg = (Num % 3 == 0 && Num % 5 == 0) ? "Multiple of both 3 and 5" : "It is not Multiple of both 3 and 5";
		
		System.out.println(msg);
	}
}