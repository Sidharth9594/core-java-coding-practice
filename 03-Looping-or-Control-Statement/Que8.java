/*Question 8: Write a java program to find the sum of all odd numbers between
Asked In Just Practice assignment
Input:

n = 10

Output:

Sum = 25

Explanation:

Odd numbers between 1 and 10 are 1, 3, 5, 7, 9.
Their sum is 1 + 3 + 5 + 7 + 9 = 25.*/

import java.util.*;

public class Que8{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		int n = sc.nextInt();
		int i = 1;
		int sum = 0;
		
		while(i <= n){
			int rem = i % 2;
			if (rem != 0){
				sum = sum + i;
			}
			i++;
		}
		System.out.println("Sum:"+sum);
	}
}