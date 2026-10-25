/*Question 20: Write a Java program to compute the sum of digits of an integer.
Asked In Basic program
Input:
123

Output:
6

Explanation:
Each digit is separated using modulus and division operations.
1 + 2 + 3 = 6.*/

public class Que20{
	public static void main(String x[]){
		int I = Integer.parseInt(x[0]);
		
		int A = I % 10;
		int X = I / 10;
		
		int B = X % 10;
		int Y = X / 10;
		
		int C = Y % 10;
		
		int sum = A + B + C ;
		System.out.println("Sum = "+sum);
	}
}