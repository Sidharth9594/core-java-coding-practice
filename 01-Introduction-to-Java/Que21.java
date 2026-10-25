/*Question 21: Write a Java program to reverse a number without using a loop.
Asked In Basic program
Input:
123

Output:
321

Explanation:
Digits are separated using arithmetic operations and rearranged in reverse order without using loops.*/

import java.util.*;
public class Que21{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter a number(Only 3 digit) : ");
		int N = sc.nextInt();
		
		int A = N % 10;
		int B =(N / 10) % 10;
		int C = N / 100;
		
		int P = A * 100 + B * 10 + C;
		System.out.println("Output : "+P);
	}
}