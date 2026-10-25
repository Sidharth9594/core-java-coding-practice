/*Question 36: Write a Java program to check whether a character is an alphabet or not.
Asked In Basic program
Input:
Character = A

Output:
Alphabet

Explanation:
If the character lies between A–Z or a–z, it is an alphabet.
Otherwise, it is not.*/

import java.util.*;

public class Que36{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Character : ");
		char ch = sc.next().charAt(0);
		
		String msg = ( ch >= 'A' && ch <= 'Z') || ( ch >= 'a' && ch <= 'z') ? "It Is Alphabet" : "It is not a Alphabet";
		System.out.println(msg);
	}
}