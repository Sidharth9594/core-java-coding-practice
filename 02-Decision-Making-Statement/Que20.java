/*Question 20: Given a number, print Perfect Square if its square root is an integer, otherwise Not Perfect Square.
Asked In Just Practice assignment
Input:
Number = 49

Output
Perfect Square

Explanation:
Square root of 49 is 7, which is an integer.
Therefore, 49 is a Perfect Square.
If the square root contains a decimal value, then it is not a Perfect Square.*/

import java.util.*;

public class Que20{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number: ");
		int N = sc.nextInt();
		
		double total = Math.sqrt(N);
		
		double C = N % total ;
		System.out.println(total);
		
		if(C==0){
			System.out.println("Perfect Square");
		}else
			System.out.println("Not a perfect square");
	}
}