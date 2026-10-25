/*Question 19: Write a Java program that reads a number and displays its cube.
Asked In Basic program
Input:
Number = 4

Output:
Cube = 64

Explanation:
The cube of a number is calculated by multiplying the number by itself three times.
4 * 4 * 4 = 64.*/

public class Que19{
	public static void main(String x[]){
		int N = Integer.parseInt(x[0]);
		
		int Cube = N * N * N;
		
		System.out.println("Cube = "+Cube);
	}
}