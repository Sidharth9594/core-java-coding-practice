/*Question 28: Write a java program to find all roots of a quadratic equation using if else. How to find all roots of a quadratic equation using if else in java programming.
Asked In Just Practice assignment
Input:
a = 8
b = -4
c = -2

Output:
Root1 = 0.80
Root2 = -0.30

Explanation:
D = (-4)^2 - 4(8)(-2)
D = 16 + 64 = 80

Since D > 0, two distinct real roots exist.
Roots are calculated using quadratic formula.*/

import java.util.*;

public class Que28{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A: ");
		int a = sc.nextInt();
		System.out.print("B: ");
		int b = sc.nextInt();
		System.out.print("A: ");
		int c = sc.nextInt();
		
		double M = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		double N = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		
		System.out.println("Root1: "+M);
		System.out.println("Root2: "+N);
		
	}
}