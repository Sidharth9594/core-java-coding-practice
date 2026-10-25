/*Question 55: Write a Java program to determine bonus based on performance rating.
Asked In Basic program
Input:
Rating = 9

Output:
15% Bonus

Explanation:
If rating > 8 ? 15% bonus
If rating between 5 and 8 ? 10% bonus
Otherwise ? No bonus
Since rating is 9, employee gets 15% bonus.*/

import java.util.*;

public class Que55{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Rating: ");
		int N = sc.nextInt();
		
		String msg = (N > 8) ? "15% Bonus" : (N > 5 && 8 > N) ? "10% Bonus" : "No Bonus";
		System.out.print(msg);
	}
}