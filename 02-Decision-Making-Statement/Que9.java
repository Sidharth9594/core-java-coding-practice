/*Question 9: Write a java program to input any alphabet and check whether it is vowel or consonant.
Asked In Just Practice assignment
Input:
Character = e

Output:
Vowel

Explanation:
Vowels: a, e, i, o, u.*/

import java.util.*;

public class Que9{
	public static void main(String x[]){
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Character: ");
		char ch = sc.next().charAt(0);
		char cha = Character.toLowerCase(ch);
		
	if (cha == 'a' || cha == 'e' || cha == 'i' || cha == 'o' || cha == 'u'){
		System.out.println("Vowel");
	} else 
		System.out.println("Consonant");
		
		
	}
}