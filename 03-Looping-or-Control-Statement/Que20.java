/*Question 20: Write a java program to swap first and last digits of a number.
Asked In Just Practice assignment
Input:

Number = 1234

Output:

Swapped Number = 4231

Explanation:

First digit (1) and last digit (4) are interchanged.
Middle digits remain the same.*/

import java.util.*;

public class Que20{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number: ");
		int n = sc.nextInt();
		
		int last = n % 10;
		int first = n;
		
		while(first >= 10){
			first = first / 10;
		}
		
		int digits = 1;
		int temp = n;
		
		while(temp >= 10){
			temp = temp / 10;
			digits++;
		}
		
		int place = 1;
		int i = 1;
		while(i < digits){
			place = place * 10;
			i++;
		}
		
		int middle = n % place;
		middle = middle / 10;
		
		int Swapped = last * place + middle * 10 + first;
		
		System.out.println("Swapped Number: "+Swapped);
	}
}