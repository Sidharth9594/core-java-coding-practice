/*Question 13: Write a java program to enter a number and print its reverse.
Asked In Just Practice assignment
Input:

Number = 1234

Output:

Reversed Number = 4321

Explanation:

The program extracts the last digit and builds the reverse number.
Each digit is added in reverse order.*/

import java.util.*;

public class Que13{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number: ");
		int n = sc.nextInt();
		int reverse = 0;
		
		while(n > 0){
			int digit = n % 10;
			reverse = reverse * 10 + digit;
			n = n / 10;
		}
		System.out.print("Reversed Number: "+reverse);
	}
}