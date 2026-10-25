/*Question 41: Classify temperature reading:
? Input: Temperature in Celsius
? Logic:
? <0 ? Freezing
? 0–20 ? Cold
? 21–35 ? Warm
? 35 ? Hot
? Output: Display weather type.
Asked In Just Practice assignment
Input:
Temperature = 15 degreesC

Output:
Cold

Explanation:
Temp < 0 ? Freezing
0–20 ? Cold
21–35 ? Warm
35 ? Hot*/

import java.util.*;

public class Que41{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Temperature: ");
		int temperature = sc.nextInt();
		
		if (temperature < 0){
			System.out.println("Freezing");
		} else if (temperature < 20 && temperature > 0){
			System.out.println("Cold");
		} else if (temperature < 35 && temperature > 21){
			System.out.println("Warm");
		} else{
			System.out.println("Hot");
		}
	}
}