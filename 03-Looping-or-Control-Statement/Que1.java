/*Question 1: Write a java program to print all natural numbers from 1 to n. using while loop.
Asked In Just Practice assignment
Input:
n = 5

Output:
1 2 3 4 5

Explanation:
The program starts from 1 and prints numbers one by one until it reaches n.
The while loop continues as long as the number is less than or equal to n.*/

import java.util.*;

public class Que1{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		int i = 1;
		
		while (i <= n){
			System.out.print(i +" ");
			i++;
		}
	}
}