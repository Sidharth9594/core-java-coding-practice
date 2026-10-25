/*Question 11: Write a Java program to enter marks of five subjects and calculate total marks and percentage.
Asked In Basic program
Input:
Marks = 70, 75, 80, 65, 60

Output:
Total = 350
Percentage = 70%

Explanation:
Total marks are calculated by adding all five subject marks.
Percentage = Total / 5. */

public class Que11{
	public static void main(String x[]){
		int a = Integer.parseInt(x[0]);
		int b = Integer.parseInt(x[1]);
		int c = Integer.parseInt(x[2]);
		int d = Integer.parseInt(x[3]);
		int e = Integer.parseInt(x[4]);
		
		int Total = a + b + c + d + e;
		int Percentage = Total/5;
		
		System.out.println("Total = "+Total);
		System.out.println("Percentage = "+Percentage+"%");
	}
}