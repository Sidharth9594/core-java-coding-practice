/*Question 2: Write a Java program to check whether a triangle is valid or not.
Asked In Just Practice assignment
Input:
A = 5, B = 6, C = 7

Output:
Valid Triangle

Explanation:
A triangle is valid if the sum of any two sides is greater than the third side*/


import java.util.*;

public class Que2{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the sides of triangle: ");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if (A + B > C && A + C > B && B + C > A){
			System.out.println("It Is A Valid Triangle");
		} else {
			System.out.println("It Is Not A Valid Triangle");
		}
	}
}