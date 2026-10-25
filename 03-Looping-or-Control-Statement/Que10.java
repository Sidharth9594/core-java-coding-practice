/*Question 10: Write a java program to count the number of digits in a number
Asked In Just Practice assignment
Input:

Number = 12345

Output:

Number of digits = 5

Explanation:

The program divides the number by 10 repeatedly until it becomes 0.
Each division reduces one digit, and a counter keeps track of total digits.*/

import java.util.*;

public class Que10{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number: ");
		int n = sc.nextInt();
		int i = 0;
		
		while(n > 0){
			n = n / 10;
			i++;
		}
		System.out.println("Number of Digits: "+i);
	}
}