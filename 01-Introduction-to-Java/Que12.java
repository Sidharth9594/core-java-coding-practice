/*Asked In Basic program
Input:
Principal = 1000
Rate = 5
Time = 2

Output:
Simple Interest = 100

Explanation:
Simple Interest formula:
SI = (Principal * Rate * Time) / 100
Applying the formula gives 100.*/

public class Que12{
	public static void main(String x[]){
		int P = Integer.parseInt(x[0]);
		int R = Integer.parseInt(x[1]);
		int T = Integer.parseInt(x[2]);
		
		int SI = (P * R * T) / 100;
		System.out.println("Simple Interest = "+SI);
	}
}