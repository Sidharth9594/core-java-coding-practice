/*Question 51: Write a Java program to find the middle value among three distinct integers using ternary operator.
Asked In Basic program
Input:
p = 10
q = 20
r = 15

Output:
Middle Number = 15

Explanation:
The middle number is the value that lies between the other two numbers.
Here, 15 lies between 10 and 20.
*/

import java.util.*;

public class Que51{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the values of P , Q and R: ");
		int P = sc.nextInt();
		int Q = sc.nextInt();
		int R = sc.nextInt();
		
		int msg = ((P > Q) && (P < R)) || ((P < Q) && (P > R)) ? P : ((Q > P) && (Q < R)) || ((Q < P) && (Q > R)) ? Q : R;
		System.out.println("Middle Number: "+msg);
	}
}