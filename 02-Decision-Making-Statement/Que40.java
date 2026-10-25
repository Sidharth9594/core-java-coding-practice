/*Question 40: Calculate commission based on sales amount:
? Input: Sales amount
? Logic:
? Sales < 5000 ? 2% commission
? Sales 5000–10000 ? 5% commission
? Sales > 10000 ? 10% commission
? Output: Display commission amount.
Asked In Just Practice assignment
Input:
Sales = 12000

Output:
Commission = 1200

Explanation:

Sales < 5000 ? 2%
5000–10000 ? 5%
10000 ? 10%
12000 * 10% = 1200*/

import java.util.*;

public class Que40{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Sales: ");
		int a = sc.nextInt();
		double Commision = 0;
		
		if (a < 5000){
			Commision = a * 0.02 ;
		} else if (a < 10000 && a > 5000){
			Commision = a * 0.05 ;
		} else if (a > 10000){
			Commision = a * 0.1 ;
		}
		
		System.out.println("Commision: "+ Commision);
	}
}