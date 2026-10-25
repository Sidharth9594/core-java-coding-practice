/*Question 10: Write a Java program to calculate the area of an equilateral triangle.
Asked In Basic program
Input : Side = 6
Output : Area = 15.59
Explanation : Area is calculated using the formula for equilateral triangles.*/
import java.util.*;

public class Que10{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		double side = sc.nextInt();
		
		double Area = (1.732/4) * side * side;
		
		System.out.println("Area = "+ Area);
	}
}