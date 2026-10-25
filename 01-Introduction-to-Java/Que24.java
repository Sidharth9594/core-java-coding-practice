/*Question 24: Write a Java program to check whether a number is a Neon number or not.
Asked In Basic program
Input:
9

Output:
Neon Number

Explanation:
A Neon number is a number where the sum of digits of its square is equal to the number itself.
9^2 = 81 ? 8 + 1 = 9.*/

import java.util.*;

public class Que24{
	public static void main(String x[]){
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Enter a number : ");
		 int N = sc.nextInt();
		 
		 int A = N * N;
		 int First = A / 10;
		 int Second = A % 10;
		 int Total = First + Second;
		 
		 String msg = N == Total ? "It is a Neon Number" : "It is not a Neon Number";
		 System.out.println(msg);
	}
}