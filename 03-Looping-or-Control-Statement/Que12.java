/*Question 12: Write a java program to calculate the product of digits in a number.
Asked In Just Practice assignment
Input:

Number = 1234

Output:

Product of digits = 24

Explanation:

Digits are extracted one by one.
1 * 2 * 3 * 4 = 24.*/

import java.util.*;

public class Que12{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Number: ");
		int n = sc.nextInt();
		int i = 1;
		int mult = 1;
		
		while(n > 0){
			n = n / 10;
			mult = mult * i;
			i++;
		}
		System.out.println("Product of digits: "+ mult);
	}
}