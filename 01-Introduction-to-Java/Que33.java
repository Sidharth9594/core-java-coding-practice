/*Question 33: Write a Java program to check whether a triangle is equilateral, isosceles, or scalene.
Asked In Basic program
Input:
Side1 = 5
Side2 = 5
Side3 = 5

Output:
Equilateral Triangle

Explanation:
If all three sides are equal ? Equilateral.
If any two sides are equal ? Isosceles.
If all sides are different ? Scalene*/

import java.util.*;

public class Que33{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the values of triangle");
		int Side1 = sc.nextInt();
		int Side2 = sc.nextInt();
		int Side3 = sc.nextInt();
		
		String msg = (Side1 == Side2 && Side2 == Side3) ? "Equilateral Triangle"  : (Side1 == Side2 || Side2 == Side3 || Side3 == Side1)?"Isosceles Triangle" : "Scalene Triangle";
		System.out.println(msg);
	}
}