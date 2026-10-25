/*Question 5: Write a Java program to enter the radius of a circle and calculate its diameter, area, and circumference.
Asked In Basic program
Input:
Radius = 7

Output:
Diameter = 14
Area = 153.86
Circumference = 43.96

Explanation:
Diameter = 2 * radius
Area = ? * r^2
Circumference = 2 * ? * r
The formulas are applied using the given radius.*/

/*
public class que5{
	public static void main(String args[]){
		float r = 7;
		float Pi = 3.14f;
		
		float Diameter = 2 * r;
		double Area = Pi * r * r;
		double Circumference = 2 * Pi * r;
		
		System.out.println("Diameter = "+Diameter);
		System.out.println("Area = "+Area);
		System.out.println("Circumference = "+Circumference);
	}
}  */

public class que5{
	public static void main(String x[]){
	
	float r = Float.parseFloat(x[0]);
	float pi = Float.parseFloat(x[1]);
	
	float D = 2 * r;
	double Area = pi * r * r;
	double C = 2 * pi * r;
	
	System.out.println("Diameter = "+D);
	System.out.println("Area = "+Area);
	System.out.println("Circumference = "+C);
	
	}
	
}