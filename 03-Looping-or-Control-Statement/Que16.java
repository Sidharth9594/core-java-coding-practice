/*Question 16: Write a java program to find power of a number.
Asked In Just Practice assignment
Input:

Base = 2
Exponent = 3

Output:

Result = 8

Explanation:

2 raised to the power 3 means 2 * 2 * 2.
The result is 8.*/

import java.util.*;

public class Que16{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Base: ");
		int base = sc.nextInt();
		System.out.print("Exponent: ");
		int exp = sc.nextInt();
		int i = 1;
		int result = 1;
		
		while(i <= exp){
			result = result * base;
			i++;
		}
		System.out.println("Result: "+result);
	}
}