/*Question 28: Write a Java program to calculate the net salary of an employee.
Asked In Basic program
Input:
Basic = 20000
HRA = 10%
DA = 5%
Tax = 2%

Output:
Net Salary = 22600

Explanation:
HRA and DA are calculated as percentages of the basic salary and added to it.
Tax is deducted after adding allowances to compute the final net salary.

*/

import java.util.*;

public class Que28{
	public static void main(String x[]){
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Basic Sallary : ");
		int BS = sc.nextInt();
		System.out.print("HRA : ");
		int HRA = sc.nextInt();
		System.out.print("DA : ");
		int DA = sc.nextInt();
		System.out.print("Tax : ");
		int Tax = sc.nextInt();
		
		int A = BS * HRA / 100;
		int B = BS * DA / 100;
		
		int Total = BS + A + B;
		
		int Net_Tax = Total * Tax / 100;
		int Net_sallary = Total - Net_Tax;
		
		System.out.println("Net Sallary : "+Net_sallary);
	}
}