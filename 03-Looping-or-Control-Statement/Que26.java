/*
Question 26: Write a java program to Check Number Is Neon Number or Not.
Example : A neon number is a number where the sum of digits of the square of the number is equal to the number.
Asked In Just Practice assignment

Input:

Number = 9

Output:

Neon Number

Explanation:

9^2 = 81
8 + 1 = 9
Since the sum equals the number, it is a Neon Number.*/

import java.util.*;

public class Que26{
  public static void main(String[] x){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Input: ");
    int n = sc.nextInt();
    int square = n * n;
    int sum = 0;
    
    for(; square > 0; square = square / 10){
    	int digits = square % 10;
    	sum = sum + digits;
    }
    if(sum == n){
    System.out.println("Neon Number");
    } else 
    System.out.println("Not a neon number");
  }  
}
