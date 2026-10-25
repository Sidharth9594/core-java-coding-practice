/*Question 4: Write a Java program to enter length and breadth of a rectangle and calculate its area.
Asked In Basic program
Input:
Length = 10
Breadth = 5

Output:
Area = 50

Explanation:
The area of a rectangle is calculated using the formula:
Area = Length * Breadth
So, 10 * 5 = 50*/

/*
public class que4{
	public static void main(String args[]){
		int Length = 10;
		int Breadth = 5;
		
		int Area = Length * Breadth;
		System.out.println("Area = " + Area);
	}
}  */

public class que4{
	public static void main(String x[]){
		int Length = Integer.parseInt(x[0]);
		int Breadth = Integer.parseInt(x[1]);
		
		int Area = Length * Breadth;
		System.out.println("Area = " + Area);
	}
}