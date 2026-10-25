/*Question 27: Write a Java program to toggle the case of an alphabet using ASCII values.
Asked In Basic program
Input:
a

Output:
A

Explanation:
Lowercase and uppercase letters differ by 32 in ASCII values.
By adding or subtracting 32, the case of the alphabet can be changed.*/

import java.util.*;

public class Que27{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter a character : ");
		char ch = sc.next().charAt(0);
		
		ch = (ch >= 'a') ? (char)(ch-32) : (char)(ch+32);
		
		System.out.println("Output : "+ch);
	}
}