/*Question 24: Write a java program to check whether a character is uppercase or lowercase alphabet.
Asked In Just Practice assignment
Input:
Character = A

Output
Uppercase Alphabet

Explanation:
Character 'A' lies between 'A' and 'Z', so it is uppercase.*/

import java.util.*;

public class Que24{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Character: ");
		char ch = sc.next().charAt(0);
		
		if(ch >= 'A' && ch <= 'Z'){
			System.out.println("Uppercase Alphabet");
		}else
			System.out.println("Lowercase Alphabet");
	}
}