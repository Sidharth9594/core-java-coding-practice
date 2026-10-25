/*Question 22: Write a java program to Check Number Is Perfect Number or Not.
Example : perfect number, a positive integer that is equal to the sum of its proper divisors. 
The smallest perfect number is 6,which is the sum of 1, 2, and 3. Other perfect numbers are 28, 496, and 8,128.
Asked In Just Practice assignment
Input:

Number = 6

Output:

Perfect Number

Explanation:

Proper divisors of 6 are 1, 2, and 3.
Sum = 1 + 2 + 3 = 6.
Since the sum equals the number, it is a Perfect Number.

Input:

Number = 10

Output:

Not a Perfect Number

Explanation:

Proper divisors of 10 are 1, 2, and 5.
Sum = 8, which is not equal to 10.*/

import java.util.*;

public class Que22{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number: ");
		int n = sc.nextInt();
		
		int i = 1;
		int sum = 0;
		
		
		while (i < n){
			if (n % i == 0){
				sum = sum + i;
			}
			i++;
		}
		if(sum == n){
			System.out.println("It Is A Perfect Number");
		} else 
			System.out.println("Not a perfect number");
	}
}