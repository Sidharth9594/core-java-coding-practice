/*Question 4: Write a Java program to check whether a number is positive, negative or zero.
Asked In Just Practice assignment
Input:
Number = -5

Output:
Negative

Explanation:
If number > 0 ? Positive
If number < 0 ? Negative
If number = 0 ? Zero*/

import java.util.*;

public class Que4{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Number: ");
		int N = sc.nextInt();
	
		if(N > 0){
			System.out.println("Positive");
		} else if (N < 0){
			System.out.println("Negative");
		} else {
			System.out.println("Zero");
		}
	}
}