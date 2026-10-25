/*Question 25: Write a java program to find the total number of notes in a given amount.
Asked In Just Practice assignment
Input:
Amount = 2528

Output
500 = 5
100 = 0
50 = 0
20 = 1
10 = 0
5 = 1
2 = 1
1 = 1

Explanation:
The amount is divided starting from the highest denomination to the lowest to calculate the number of notes.*/

import java.util.*;

public class Que25{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Amount: ");
		int Amount = sc.nextInt();
	    int a_500=0;
	    int a_100=0;
	    int a_50=0;
		int a_20=0;
	    int a_10=0;
	    int a_5=0;
	    int a_2=0;
	    int a_1=0;
		
		if ( Amount >= 500){
			a_500 = Amount / 500;
			Amount = Amount % 500;
		} if ( Amount >= 100){
		    a_100 = Amount / 100;
			Amount = Amount % 100;
		} if ( Amount >= 50){
			a_50 = Amount / 50;
			Amount = Amount % 50;
		} if ( Amount >= 20){
			a_20= Amount / 20;
			Amount = Amount % 20;
		} if ( Amount >= 10){
			a_10 = Amount / 10;
			Amount = Amount % 10;
		} if ( Amount >= 5){
			a_5 = Amount / 5;
			Amount = Amount % 5;
		} if ( Amount >= 2){
			a_2= Amount / 2;
			Amount = Amount % 2;
		} if ( Amount >=1) {
			a_1= Amount / 1;
			Amount = Amount % 1;
		}
		
		System.out.println("500: "+a_500);
		System.out.println("100: "+a_100);
		System.out.println("50: "+a_50);
		System.out.println("20: "+a_20);
		System.out.println("10: "+a_10);
		System.out.println("5: "+a_5);
		System.out.println("2: "+a_2);
		System.out.println("1: "+a_1);
	}
}