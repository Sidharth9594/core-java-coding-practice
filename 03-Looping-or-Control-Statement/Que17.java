/*Question 17: Write a java program to find all factors of a number.
Asked In Just Practice assignment
Input:

Number = 12

Output:

Factors: 1 2 3 4 6 12

Explanation:

A factor divides the number completely without remainder.
All numbers that divide 12 exactly are printed.

*/

import java.util.*;

public class Que17{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number: ");
		int n = sc.nextInt();
		int i = 1;
		System.out.print("Factors: ");
		
		while(i <= n){
			if(n % i == 0){
				System.out.print(i + " ");
			}
			i++;
		}
	}
}