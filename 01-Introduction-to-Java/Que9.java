/*Question 9: Write a Java program to enter two angles of a triangle and find the third angle.
Asked In Basic program
Input:
Angle1 = 50
Angle2 = 60

Output:
Third Angle = 70

Explanation:
The sum of all angles in a triangle is 180 degrees.
Third Angle = 180 ? (Angle1 + Angle2).*/

public class Que9{
	public static void main (String x[]){
		int a1 = Integer.parseInt(x[0]);
		int a2 = Integer.parseInt(x[1]);
		
		int a3 = 180 - a1 - a2;
		
		System.out.println("Third Angle = "+ a3);
	}
}