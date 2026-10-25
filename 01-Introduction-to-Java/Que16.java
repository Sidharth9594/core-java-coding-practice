/*Question 16: Write a Java program to print the ASCII value of a given character
Asked In Basic program
Input:
Character = A

Output:
ASCII value = 65

Explanation:
Every character has a unique ASCII value. When a character is typecast to an integer, its ASCII value is obtained. The ASCII value of 'A' is 6*/

public class Que16{
	public static void main(String x[]){
		char ch = x[0].charAt(0);
		int A = (int)ch;
		
		System.out.println("ASCII Value = "+A);
	}
}