/*Question 23: Write a Java program to calculate the sum of the first and last digit without using a loop.
Asked In Basic program
Input:
123

Output:
4

Explanation:
First digit = 1
Last digit = 3
Sum = 1 + 3 = 4.*/

import java.util.*;

public class Que23{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number(only 3 digit) : ");
		int N = sc.nextInt();
		
		int A = N / 100;
		int B = N % 10;
		
		System.out.println("first digit : "+A);
		System.out.println("second digit : "+B);
		
		int O = A + B;
		System.out.println("Output : "+ O);
	}
}