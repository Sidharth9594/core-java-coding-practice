/*Question 40: Write a Java program to check whether a character is an alphabet, digit, or special character.
Asked In Basic program
Input:
Character = @

Output:
Special Character

Explanation:
If character is between A–Z or a–z ? Alphabet
If between 0–9 ? Digit
Otherwise ? Special Character*/

import java.util.*;

public class Que40{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input: ");
		char ch = sc.next().charAt(0);
		
		String msg = ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) ? "Alphabet" : (ch >= '0' && ch <= '9') ? "Digit" : "Special Character";
		System.out.println(msg);
	}
}