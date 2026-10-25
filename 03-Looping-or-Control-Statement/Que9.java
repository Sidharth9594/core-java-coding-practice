/*Question 9: Write a java program to print a multiplication table of any number.
Asked In Just Practice assignment
Input:

Number = 5

Output:

5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
...
5 x 10 = 50

Explanation:

The program multiplies the given number by values from 1 to 10.
Each result is printed in table format.*/

import java.util.*;

public class Que9{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number: ");
		int n = sc.nextInt();
		int i = 1;
		int mult = 1;
		
		while(i <= 10){
			mult = n * i;
			System.out.println(n +" * "+ i +" = " + mult);
			i++;
		}
	}
}