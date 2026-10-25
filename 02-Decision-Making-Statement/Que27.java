/*Question 27: Write a Java program to input marks of five subjects: Physics, Chemistry, Biology, Mathematics, and Computer. Calculate the percentage and display the grade according to the following rules.

Grading Rules:
percentage >= 90: Grade A
percentage >= 80: Grade B
percentage >= 70: Grade C
percentage >= 60: Grade D
percentage >= 40: Grade E
percentage < 40: Grade F
Asked In Just Practice assignment
Input:
Physics = 85
Chemistry = 80
Biology = 75
Mathematics = 90
Computer = 70

Output:
Percentage = 80 percent
Grade = B

Explanation:
Total Marks = 85 + 80 + 75 + 90 + 70 = 400

Percentage = Total Marks / 5 = 80 percent

Since the percentage is 80, Grade B is assigned.*/

import java.util.*;

public class Que27{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Physics: ");
		int a = sc.nextInt();
		System.out.print("chemestry: ");
		int b = sc.nextInt();
		System.out.print("Biology: ");
		int c = sc.nextInt();
		System.out.print("Mathematics: ");
		int d = sc.nextInt();
		System.out.print("Computer: ");
		int e = sc.nextInt();
		
		int Percentage = (a + b + c + d + e)/5;
		System.out.println("Percentage: "+Percentage+"%");
		
		if (Percentage >= 90){
			System.out.println("Grade A");
		} else if (Percentage >= 80){
			System.out.println("Grade B");
		} else if (Percentage >= 70){
			System.out.println("Grade C");
		} else if (Percentage >= 60){
			System.out.println("Grade D");
		} else if (Percentage >= 40){
			System.out.println("Grade E");
		} else if (Percentage < 40){
			System.out.println("Grade F");
		}
	}
}