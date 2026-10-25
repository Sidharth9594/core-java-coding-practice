/*Question 32: An automobile company manufactures two-wheelers (TW) and four-wheelers (FW). The company manager wants to determine how many two-wheelers and four-wheelers should be manufactured based on the following data:

- Total number of vehicles = V
- Total number of wheels = W

Find the number of two-wheelers and four-wheelers using the given values.
Asked In Just Practice assignment
Input:
V = 200
W = 540

Output:
TW = 130
FW = 70

Explanation:
Total vehicles = TW + FW
Total wheels = (2 * TW) + (4 * FW)

Using the given values:
TW = 130
FW = 70

Verification:
130 + 70 = 200
(2 * 130) + (4 * 70) = 260 + 280 = 540

Therefore, the company should manufacture 130 two-wheelers and 70 four-wheelers.*/

import java.util.*;

public class Que32{
	public static void main(String x[]){
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Total Vehicles: ");
		int v = sc.nextInt();
		
		System.out.print("Total Wheels: ");
		int w = sc.nextInt();
		
		int FW = (w - (2 * v)) / 2 ;
		int TW = v - FW;
		
		System.out.println("Total two-wheelers: "+TW);
		System.out.println("Total four-wheelers: "+FW);
		
	}
}