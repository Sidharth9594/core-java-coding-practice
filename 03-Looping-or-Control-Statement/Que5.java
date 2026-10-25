/*Question 5: Write a java program to print all odd numbers between 1 to 100.
Asked In Just Practice assignment
Input:

No input required

Output:

1 3 5 7 ... 99

Explanation:

Odd numbers are not divisible by 2.
The program prints numbers where number % 2 is not equal to 0.*/

import java.util.*;

public class Que5{
	public static void main(String x[]){
		
		int n = 1;
		
		while (n <= 100){
			if (n % 2 != 0){
				System.out.print(n + " ");
			} 
			n++;
		}
	}
}