/*Question 11: Write a java program to calculate the sum of digits in a number.
Asked In Just Practice assignment
Input:

Number = 1234

Output:

Sum of digits = 10

Explanation:

The program separates each digit using modulus (%) and division (/).
Digits are 1, 2, 3, 4 and their sum is 1 + 2 + 3 + 4 = 10.*/

import java.util.*;

public class Que11{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number: ");
		int n = sc.nextInt();
		int sum = 0;
		
		while(n > 0){
			int digit = n % 10;
			n = n / 10;
			sum = sum + digit;
		}
		System.out.println("Sum of digits: "+sum);
	}
}