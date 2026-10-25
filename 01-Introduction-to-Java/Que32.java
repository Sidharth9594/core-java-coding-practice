/*Question 32: Write a Java program to check whether a triangle is valid or not using its three angles.
Asked In Basic program
Input:
Angle1 = 60
Angle2 = 60
Angle3 = 60

Output:
Valid Triangle

Explanation:
A triangle is valid only if the sum of all three angles is exactly 180 degrees.
60 + 60 + 60 = 180, so it is valid.*/

import java.util.*;

public class Que32{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the values of triangle");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int Total = a + b + c ;
		
		String msg = Total == 180 ? "It is a valid Triangle" : "It ia not a valid Triangle";
		System.out.println(msg);
	}
} 