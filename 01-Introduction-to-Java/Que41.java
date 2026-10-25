/*Question 41: Write a Java program to find the maximum among three numbers.
Asked In Basic program
Input:
A = 10
B = 25
C = 15

Output:
Maximum = 25

Explanation:
The program compares all three numbers using conditional statements and prints the largest value.*/

import java.util.*;

public class Que41{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 3 Number:");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		String msg = (A >= B  && A >= C) ? "Maximum:"+ A : (B >= A && B >= C) ? "Maximum: "+B : "Maximum: "+C ;
		System.out.println(msg);
	}
}