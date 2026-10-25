/*Question 54: Write a Java expression using arithmetic and assignment operators to calculate net salary.
Asked In Basic program
Input:
Basic Salary = 35000
Tax Rate = 12%

Output:
Net Salary = 30800

Explanation:
Tax amount = 12% of 35000 = 4200
Net Salary = 35000 ? 4200 = 30800.*/

import java.util.*;

public class Que54{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Basic Salary: ");
		int A = sc.nextInt();
		
		System.out.print("Tax Rate: ");
		int B = sc.nextInt();
		
		double Tax_amo = A * (B / 100.0);
		double Net_sal = A - Tax_amo;
		
		System.out.print("Net Salary: "+Net_sal);
	}
}