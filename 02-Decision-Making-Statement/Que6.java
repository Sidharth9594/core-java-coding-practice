/*Question 6: Write a Java program to check whether a character is alphabetic or not.
Asked In Just Practice assignment
Input:
Character = A

Output:
Alphabet

Explanation:
If character lies between A–Z or a–z.*/

import java.util.*;

public class Que6{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Character: ");
		char ch = sc.next().charAt(0);
		
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
			System.out.println("Alphabet");
		} else {
			System.out.println("Not a alphabet");
		}
	}
}