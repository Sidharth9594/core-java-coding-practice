/*Question 29: Write a Java program to input electricity units consumed and calculate the total electricity bill according to the following rules.

Billing Rules:
For the first 50 units:
Rs. 0.50 per unit
For the next 100 units:
Rs. 0.75 per unit
For the next 150 units:
Rs. 1.20 per unit
For units above 250:
Rs. 1.50 per unit

After calculating the bill, add a surcharge of 20 percent.
Asked In Just Practice assignment
Input:
Units = 300

Output:
Total Electricity Bill = Calculated Amount

Explanation:
First 50 units = 50 * 0.50
Next 100 units = 100 * 0.75
Next 150 units = 150 * 1.20
Remaining units = 50 * 1.50
The total amount is calculated by adding all charges, and then a 20 percent surcharge is added.*/

import java.util.*;

public class Que29{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Units: ");
		int Units = sc.nextInt();
		double total = 0;
		
		if(Units <= 50){
			total = Units * 0.50;
		} else if (Units <= 150){
			total = (50 * 0.50) + ((Units - 50) * 0.75);
		} else if (Units <= 300){
			total = (50 * 0.50) + (100 * 0.75) + ((Units - 150) * 1.20);
		} else {
			total = (50 * 0.50) + (100 * 0.72) + (150 * 1.20) + ((Units - 300) * 1.50);
		}
		double surcharge = total * 0.20;
		double bill = total + surcharge;
		
		System.out.println("bill:" + total);
		System.out.println("surcharge:"+surcharge);
		System.out.println("Total electricity bill: "+ bill);
	}
}