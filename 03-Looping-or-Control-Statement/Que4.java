/*Question 4: Write a java program to print all even numbers between 1 to 100.- using while loop
Asked In Just Practice assignment
Input:

No input required

Output:

2 4 6 8 ... 100

Explanation:

Even numbers are divisible by 2.
The program checks each number from 1 to 100 and prints it if it is divisible by 2.*/

import java.util.*;

public class Que4{
	public static void main(String x[]){
		
		int n = 1;
		
		while (n <= 100){
			if (n % 2 == 0){
			System.out.print(n + " ");
			}
			n++;
		}
	}
}