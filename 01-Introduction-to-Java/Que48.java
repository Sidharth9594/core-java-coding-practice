/*Question 48: Write a Java program to print Pass if marks are 40 or above, otherwise Fail.
Asked In Basic program
Input:
Marks = 38

Output:
Fail

Explanation:
If marks ? 40, the result is Pass.
If marks are below 40, the result is Fail.*/

import java.util.*;

public class Que48{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Marks: ");
		int N = sc.nextInt();
		
		String msg = (N >= 40) ? "Pass" : "Fail";
		System.out.println(msg);
	}
}