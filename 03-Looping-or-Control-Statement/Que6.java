/*Question 6: Write a java program to find the sum of all natural numbers between 1 to n.
Asked In Just Practice assignment
Input:

n = 5

Output:

Sum = 15

Explanation:

The program adds numbers from 1 to 5.
1 + 2 + 3 + 4 + 5 = 15.*/

import java.util.*;

public class Que6{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		int i = 1;
		int sum = 0;
		
		while(i <= n){
			sum = sum + i;
			i++;
		}
		System.out.print("sum: "+ sum);
	}
}