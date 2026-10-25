/*Question 34: There are n monkeys sitting on the branches of a tree. Travelers offer bananas and peanuts to the monkeys.

Each monkey can eat either:
- k bananas, or
- j peanuts.

One monkey comes down at a time, finishes eating, and does not return to the tree. If the remaining bananas are less than k 
or the remaining peanuts are less than j, one last monkey can still come down and eat the remaining food.

Write a Java program to input n, k, j, m, and p, and calculate the number of monkeys left on the tree.

Where:
n = Total number of monkeys
k = Number of bananas eaten by one monkey
j = Number of peanuts eaten by one monkey
m = Total number of bananas
p = Total number of peanuts
Asked In Just Practice assignment
Input:
n = 20
k = 2
j = 3
m = 12
p = 12

Output:
Number of Monkeys left on the tree = 10

Explanation:
Banana-eating monkeys = 12 / 2 = 6
Peanut-eating monkeys = 12 / 3 = 4

Total monkeys that came down = 6 + 4 = 10

Remaining monkeys = 20 - 10 = 10*/

import java.util.*;

public class Que34{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Total number of monkeys:");
		int n = sc.nextInt();
		System.out.print("Number of bananas eaten by one monkey:");
		int k = sc.nextInt();
		System.out.print("Number of peanuts eaten by one monkey:");
		int j = sc.nextInt();
		System.out.print("Total number of bananas:");
		int m = sc.nextInt();
		System.out.print("Total number of peanuts:");
		int p = sc.nextInt();
		
		int B_M = m / k;
		int P_M = p / j;
		
		int R_M  = n - B_M - P_M;
		System.out.println("Remaining monkeys: "+R_M);
	}
}