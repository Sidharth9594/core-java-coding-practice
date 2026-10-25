/*Question 39: Write a Java program to input an alphabet and check whether it is a vowel or consonant.
Asked In Basic program
Input:
Alphabet = e

Output:
Vowel

Explanation:
Vowels are a, e, i, o, u (both uppercase and lowercase).
All other alphabets are consonants.*/

import java.util.*;

public class Que39{
	public static void main (String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enetr a Alphabet: ");
		char ch = sc.next().charAt(0);
		
		char cha = Character.toLowerCase(ch);
		
		String msg = ( cha == 'a' || cha == 'e' || cha == 'i' || cha == 'o' || cha == 'u') ? "It is a Vowel" : "It is a Consonants";
		System.out.println(msg);
	}
}