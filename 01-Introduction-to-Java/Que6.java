/*Question 6: Write a Java program to convert length from centimeter into meter and kilometer.'
Asked In Basic program
Input:
Centimeter = 150
Output:
Meter = 1.5
Kilometer = 0.0015
Explanation:
1 meter = 100 centimeters
1 kilometer = 100000 centimeters
The given value is converted using standard unit conversion formulas.*/

/*
public class Que6{
	public static void main(String args[]){
		
		double a = 150;
		
		double Meter = a / 100;
		double Kilometer = a /100000;
		
		System.out.println("Meter = "+Meter);
		System.out.println("Kilometer = "+Kilometer);
	}
} */

public class Que6{
	public static void main(String x[]){
		
		double a = Double.parseDouble(x[0]);
		
		double Meter = a / 100;
		double Kilometer = a /100000;
		
		System.out.println("Meter = "+Meter);
		System.out.println("Kilometer = "+Kilometer);
	}
}