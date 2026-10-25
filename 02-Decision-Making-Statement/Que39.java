/*Question 39: Write a Java program to check whether a student is eligible for scholarship.

Conditions:
Attendance >= 75 percent
Marks >= 80
Asked In Just Practice assignment
Input:
Attendance = 80
Marks = 85

Output:
Eligible for Scholarship

Explanation:
Check the attendance and marks conditions using if-else.
If both conditions are satisfied, the student is eligible; otherwise, the student is not eligible.*/

import java.util.*;

public class Que39{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Attendance: ");
		int a = sc.nextInt();
		System.out.print("Marks: ");
		int b = sc.nextInt();
		
		if (a >= 75 && b >= 80){
			System.out.println("Eligible for Scolership");
		} else
			System.out.println("Not Eligible for scolership");
	}
}