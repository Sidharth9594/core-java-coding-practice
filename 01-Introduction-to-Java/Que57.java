/*Question 57: Problem Statement Second
The chef is watching TV. The current volume of the TV is XX. Pressing the volume up button of the TV remote increases the volume by 1 while pressing the volume down button decreases the volume by 1. The chef wants to change the volume from XX to YY. Find the minimum number of button presses required to do so.
Input Format
? The first line contains a single integer TT - the number of test cases. Then the test cases follow.
? The first and only line of each test case contains two integers XX and YY - the initial volume and final volume of the TV.
Output Format
For each test case, output the minimum number of times Chef has to press a button to change the volume from XX to YY.
Constraints
1<=T <=100
1<=X<=Y<=100
Asked In Basic program
Input:
50 54
12 10

Output:
4
2

Explanation:
Minimum button presses = absolute difference between initial and final volume.
|50 ? 54| = 4
|12 ? 10| = 2*/

import java.util.*;

public class Que57{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input: ");
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int N = Math.abs(A - B);
		
		System.out.println(N);
	}
}