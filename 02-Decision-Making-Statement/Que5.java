/*Question 5: Write a Java program to check whether a number is divisible by 5 and 11 or not.
Asked In Just Practice assignment
Input:
Number = 55

Output:
Divisible by 5 and 11

Explanation:
If number % 5 == 0 AND number % 11 == 0.*/

import java.util.*;

public class Que5{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number: ");
		int N = sc.nextInt();
		
		if(N % 5 == 0 && N % 11 == 0){
			System.out.println("Divisible by 5 and 11");
		} else {
			System.out.println("Not Divisible by 5 and 11");
		}
	}
}