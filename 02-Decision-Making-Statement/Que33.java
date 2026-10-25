/*Question 33: There is a JAR full of candies for sale at a mall counter. JAR has the capacity N, that is JAR can contain maximum N candies when JAR is full. 
At any point of time. JAR can have M number of Candies where M<=N. Candies are served to the customers. 
JAR never remains empty as when the last k candies are left. JAR is refilled with new candies in such a way that JAR gets full.
Write a code to implement the above scenario. Display JAR at the counter with the available number of candies. 
Input should be the number of candies one customer can order at a point of time. Update the JAR after each purchase and display JAR at Counter.
Output should give the number of Candies sold and the updated number of Candies in JAR. If Input is more than candies in JAR, return: “INVALID INPUT”.
Given,
N=10, where N is NUMBER OF CANDIES AVAILABLE
K =< 5, where k is the number of minimum candies that must be inside JAR ever.
Asked In Just Practice assignment
Example 1
Input:
Customer orders 3 candies

Output:
NUMBER OF CANDIES SOLD: 3
NUMBER OF CANDIES AVAILABLE: 7
Explanation:
10 – 3 = 7 candies left. Since 7 > 5, jar is not refilled.

Example 2
Input:
Customer orders 0 candies

Output:
INVALID INPUT
NUMBER OF CANDIES LEFT: 10

Explanation:
Order must be greater than 0 and less than available candies.*/

import java.util.*;

public class Que33{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		int N = 10;
		int K = 5;
		int candies = N;
		
		System.out.print("No. of Candies Customer Buy: ");
		int order = sc.nextInt();
		
		if (order <= 0 || order > N){
			System.out.println("INVALID INPUT");
			System.out.println("NUMBER OF CANDIES LEFT: "+candies);
		} else {
			candies = candies - order;
			System.out.println("NUMBER OF CANDIES SOLD: "+order);
			if (candies > K){
				System.out.println("NUMBER OF CANDIES LEFT: "+candies);
			} 
		} 
	}
}