/*Question 17: Write a Java program to convert seconds into hours, minutes, and seconds.
Asked In Basic program
Input:
Seconds = 3665

Output:
Hours = 1
Minutes = 1
Seconds = 5

Explanation:
1 hour = 3600 seconds.
3665 / 3600 gives 1 hour.
Remaining seconds are converted into minutes and seconds using division and modulus operations.*/

public class Que17{
	public static void main(String x[]){
		int sec = Integer.parseInt(x[0]);
		
		int Hours = sec / 3600;
		int Resec = sec % 3600;
		
		int Minutes = Resec / 60;
		int Seconds = Resec % 60;
		
		System.out.println("Hours = "+Hours);
		System.out.println("Minutes = "+Minutes);
		System.out.println("Seconds = "+Seconds);
	}
}