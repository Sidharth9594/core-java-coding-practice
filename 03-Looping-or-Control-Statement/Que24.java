/*Question 24: Write a java program to Check Number Is Strong Number or Not.
Example : A strong number is one in which the factorial of the digits equals the number itself. 1, 2, 145,
Asked In Just Practice assignment
Input:

Number = 145

Output:

Strong Number

Explanation:

1! + 4! + 5! = 1 + 24 + 120 = 145.
Since the sum equals the number, it is a Strong Number*/

import java.util.*;

public class Que24{
public static void main(String[] x){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Input: ");
	int n = sc.nextInt();
	int temp = n;
	int sum = 0;
	
	while(n > 0){
		int digit = n % 10;
		int fact = 1;
		int i = 1;
		while(i <= digit){
			fact = fact*i;
			i++;
			}
		sum = sum + fact;
		n = n / 10;
		}
	if (sum == temp){
	System.out.println("Strong Number");
	}else 
	System.out.println("Not a strong number");
	}
}
