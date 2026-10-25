/*Question 37: Write a Java program to input cost price and selling price and determine profit or loss.
Asked In Basic program
Input:
Cost Price = 500
Selling Price = 650

Output:
Profit

Explanation:
If selling price > cost price ? Profit
If selling price < cost price ? Loss
If both are equal ? No Profit No Loss*/

import java.util.*;

public class Que37{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter cost price and selling price");
		int cp = sc.nextInt();
 		int sp = sc.nextInt();
		
		String msg = (sp > cp) ? "Profit" : (sp < cp) ? "Loss" : "No Profit No Loss";
		System.out.println(msg);
	}
}