/*Question 15: Write a Java program to swap two numbers without using a third variable.
Asked In Basic program
Input:
A = 4
B = 7

Output:
A = 7
B = 4

Explanation:
Swapping is done using arithmetic operations such as addition and subtraction without using an extra variable.*/

public class Que15{
	public static void main(String x[]){
		int A = Integer.parseInt(x[0]);
		int B = Integer.parseInt(x[1]);
		
		A = A + B;
		B = A - B;
		A = A - B;
		
		System.out.println("After Swapping A = "+A);
		System.out.println("After Swapping B = "+B);
	}
}