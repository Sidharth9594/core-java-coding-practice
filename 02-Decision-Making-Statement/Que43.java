/*Question 43: Mobile plan billing system:
? Input: Minutes used in a month
? Logic:
? Up to 100 mins ? Base ?199
? 101–300 mins ? ?199 + ?1/min for extra
? 301–500 mins ? ?199 + ?1.5/min for extra
? Above 500 mins ? ?199 + ?2/min for extra
? Output: Total monthly bill.
Asked In Just Practice assignment
Input
Minutes Used = 350

Logic
Up to 100 mins ? ?199

101–300 mins ? ?199 + ?1 per extra minute

301–500 mins ? ?199 + ?1.5 per extra minute

Above 500 mins ? ?199 + ?2 per extra minute

Output
Total Bill = ?574

Explanation
Extra minutes = 350 ? 100 = 250
Since usage is in 301–500 range:
Extra charge = 250 * 1.5 = 375
Total Bill = 199 + 375 = 574*/

import java.util.*;

public class Que43{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Minutes Used: ");
		int MU = sc.nextInt();
		int BB = 199;
		double total=0;
		MU = MU - 100;
		
		if(MU <= 100){
			total = BB;
		} else if ( MU <= 301 ){
			total = BB + (MU * 1);
		} else if (MU <= 500){
			total = BB + (MU * 1.5);
		} else if(MU > 500){
			total = BB + (MU * 2);
		}
		System.out.println("Total Bill: "+ total);
	}
}