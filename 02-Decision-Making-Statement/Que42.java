/*Question 42: Employee salary hike based on performance and years of service:
? Input: Basic salary, Years of service, Performance rating (1–5)
? Logic:
? If rating >= 4 and service > 5 yrs ? 20% hike
? Else if rating >= 3 ? 10%
? Else ? 5%
? Output: New salary.
Asked In Just Practice assignment
Input
Basic Salary
Years of Service
Performance Rating (1-5)

Example Input:
Basic Salary = 30000
Years of Service = 6
Rating = 4

Logic
If rating ? 4 and service > 5 years ? 20% hike
Else if rating ? 3 ? 10% hike
Else ? 5% hike

Output
New Salary = 36000

Explanation
Since rating is 4 and service is more than 5 years, employee gets 20% hike.
20% of 30000 = 6000
New Salary = 30000 + 6000 = 36000*/

import java.util.*;

public class Que42{
	public static void main(String x[]){
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Basic Salary: ");
		int BS = sc.nextInt();
		System.out.print("Years of Service: ");
		int YS = sc.nextInt();
		System.out.print("Performance Rating (1-5): ");
		int PR = sc.nextInt();
		double NS = 0;
		
		if (PR >= 4 && YS > 5){
			NS = BS * 0.2 ;
			NS = NS + BS;
		} else if(PR >= 3){
			NS = BS * 0.1;
			NS = NS + BS;
		} else{
			NS = BS * 0.05;
			NS = NS + BS;
		}
		System.out.println("New Salary: "+NS);
	}
}