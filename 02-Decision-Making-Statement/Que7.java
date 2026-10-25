/*Question 7: Write a Java program to input cost price and selling price of a product and check profit or loss.
Asked In Just Practice assignment
Input:
Cost Price = 500
Selling Price = 650

Output:
Profit

Explanation:
If SP > CP ? Profit
If SP < CP ? Loss*/

import java.util.*;

public class Que7{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Cost Price: ");
		int CP = sc.nextInt();
		
		System.out.print("Selling Price: ");
		int SP = sc.nextInt();
		
		if (SP > CP){
			System.out.println("Profit");
		} else if (CP > SP) {
			System.out.println("Loss");
		} else{
			System.out.println("Not Profit & Loss");
		}
	}
}