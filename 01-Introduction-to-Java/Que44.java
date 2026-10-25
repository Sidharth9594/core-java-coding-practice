/*Question 44: Write a Java program to calculate gross salary based on basic salary conditions.
Asked In Basic program
Input:
Basic Salary = 18000

Output:
Gross Salary = 34650

Explanation:
Gross salary is calculated by adding HRA and DA to the basic salary according to the given salary slab conditions.*/

import java.util.*;

public class Que44{
	public static void main(String x[]){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter Baisc Sallary: ");
	double BS = sc.nextDouble();
	
	double HRA = BS * 0.5;
	double DA = BS * 0.25;
	
	double GS = BS + HRA + DA ;
	System.out.println("Gross Salary: "+GS);
	}
}