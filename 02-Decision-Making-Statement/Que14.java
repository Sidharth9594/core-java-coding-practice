/*Question 14: Write a Java program to input the basic salary of an employee and calculate its Gross Salary according to the following rules.

Basic Salary <= 10000:
HRA = 20 percent
DA = 80 percent

Basic Salary <= 20000:
HRA = 25 percent
DA = 90 percent

Basic Salary > 20000:
HRA = 30 percent
DA = 95 percent
Asked In Just Practice assignment
Input:
Basic Salary = 15000

Output:
Gross Salary = 32250

Explanation:
Since Basic Salary is 15000 and it is <= 20000:

HRA = 25 percent of 15000 = 3750

DA = 90 percent of 15000 = 13500

Gross Salary = Basic Salary + HRA + DA

Gross Salary = 15000 + 3750 + 13500 = 32250*/

import java.util.*;

public class Que14{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Basic sallary: ");
		int N = sc.nextInt();
		
		if (N <= 10000){
			double A = N * 0.20 + N * 0.80 + N ;
			System.out.println("Gross Salary: "+A);
		} else if (N <= 20000){
			double B = N * 0.25 + N * 0.90 + N;
			System.out.println("Gross Salary: "+B);
		} else {
			double C = N * 30 + N * 90 + N;
			System.out.println("Gross salary: "+C);
		}
	}
}