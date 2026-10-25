/*Question 10: Write a java program to input any character and check whether it is alphabet, digit or special character.
Asked In Just Practice assignmentb
Input:
Character = 5

Output:
Digit

Explanation:
Check ASCII ranges.*/

import java.util.*;

public class Que10{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Character :");
		char ch = sc.next().charAt(0);
		
		if ((ch >= 65 && ch <=90) || (ch >=97 && ch <= 122)){
			System.out.println("Alphabet");
		} else if (ch >= 48 && ch <= 57) {
			System.out.println("Digit");
		} else 
			System.out.println("Special Chracter");
	}
}