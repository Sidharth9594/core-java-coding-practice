/*Question 26: Write a Java program to accept the height of a person in centimeters and categorize the person according to their height.

Rules:

If Height < 150.0:
The person is Dwarf.

If Height >= 150.0 and Height < 165.0:
The person is of average height.

If Height >= 165.0 and Height <= 195.0:
The person is taller.
Asked In Just Practice assignment
Input:
Height = 135

Output:
The person is Dwarf

Explanation:
Since Height is 135 and it is less than 150, the person is categorized as Dwarf.*/

import java.util.*;

public class Que26{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Height: ");
		double N = sc.nextDouble();
		
		if ( N < 150.0){
			System.out.println("The person is Dwarf.");
		} else if (N <= 150.0 && N < 165){
			System.out.println("The person is of average height.");
		} else if (N >= 165.0 && N<= 195.0){
			System.out.println("The person is taller.");
		}
	}
}