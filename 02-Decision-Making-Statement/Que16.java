/*Question 16: Write a java program to find a minimum between three numbers.
Asked In Just Practice assignment
Input:
Number1 = 9
Number2 = 4
Number3 = 7

Output
Minimum number = 4

Explanation:
Compare all three numbers using nested if-else statements to determine the smallest number.*/

import java.util.*;

public class Que16{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number1: ");
		int a = sc.nextInt();
		System.out.print("Number2: ");
		int b = sc.nextInt();
		System.out.print("Number3: ");
		int c = sc.nextInt();
		
		if (a > b && b > c){
			System.out.println("Minimum Number: "+c);
		} else if (b > a && c > a){
			System.out.println("Minimum Number: "+a);
		} else 
			System.out.println("Minimum Number: "+b);
	}
}