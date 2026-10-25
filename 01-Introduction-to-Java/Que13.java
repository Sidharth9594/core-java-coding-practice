/*Question 13: Write a Java program to calculate compound interest.
Asked In Basic program
Input:
Principal = 2000
Rate = 10
Time = 2

Output:
Compound Interest = 420

Explanation:
Compound Interest is calculated using the formula:
CI = P(1 + R/100)^T ? P
After calculation, the compound interest is 420.*/

public class Que13{
	public static void main(String x[]){
		
		int P = Integer.parseInt(x[0]);
		double R = Integer.parseInt(x[1]);
		int T = Integer.parseInt(x[2]);
		
		double CI = P * Math.pow(( 1 + R / 100),T) - P;
		System.out.println("Compound Interest = "+CI);
	}
}