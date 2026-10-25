/*Question 14: Write a Java program to swap two numbers using a third variable.
Asked In Basic program
Input:
A = 5
B = 10

Output:
A = 10
B = 5

Explanation:
A temporary variable is used to store one value while swapping the numbers*/

public class Que14{
	public static void main(String x[]){
		
		
		int A = Integer.parseInt(x[0]);
		int B = Integer.parseInt(x[1]);
		
		int temp = A;
		
		A = B;
		B = temp;
		
		System.out.println("After Swapping A = "+A);
		System.out.println("After Swapping B = "+B);
	}
}