/*Question 3: Write a Java program to check whether a triangle is equilateral, isosceles or scalene.
Asked In Just Practice assignment
Input:
A = 5, B = 5, C = 5

Output:
Equilateral

Explanation:
All sides equal ? Equilateral
Two sides equal ? Isosceles
All sides different ? Scalene*/

import java.util.*;

public class Que3{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Sides of Triangle: ");
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if (A == B && B == C) {
			System.out.println("Equilateral");
		} else if (A == B || B == C || C == A){
			System.out.println("Isosceles");
		} else {
			System.out.println("Scalene");
		}
	}
}