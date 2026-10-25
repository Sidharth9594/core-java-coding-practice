/*Question 35: Check whether a given employee is eligible for bonus:

Input: Years of service and salary.
Logic: If service > 5 years, give 5% bonus.
Output: Display bonus amount or no bonus
Asked In Just Practice assignment
Input:
Years of Service = 7
Salary = 50000

Output:
Bonus = 2500

Explanation:
If service > 5 years ? 5% bonus
5% of 50000 = 2500
If service ? 5 ? No Bonus*/

import java.util.*;

public class Que35{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Years of service: ");
		int a = sc.nextInt();
		System.out.print("Salary: ");
		int b = sc.nextInt();
		
		if(a > 5){
			double Bonus = b * 0.05;
			System.out.println("Bonus: "+ Bonus);
		} else
			System.out.println("No Bonus");
	}
}