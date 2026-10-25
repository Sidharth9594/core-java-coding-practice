/*Question 7: Write a Java program to convert temperature from Fahrenheit to Celsius.
Asked In Basic program
Input:
Fahrenheit = 98

Output:
Celsius = 36.67

Explanation:
The formula used is:
C = (F ? 32) * 5 / 9
Applying the formula gives the Celsius temperature.*/

public class Que7{
	public static void main(String x[]){
		
		float F = Float.parseFloat(x[0]);
		
		float c = (F - 32) * 5 / 9;
		
		System.out.println("celsius = "+c);
	}
}