/*
Question 28: Write a java program to Check Number Is Spy Number or Not.
Example : A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
Asked In Just Practice assignment

Input:

Number = 1412

Output:

Spy Number

Explanation:

Sum = 1 + 4 + 1 + 2 = 8
Product = 1 * 4 * 1 * 2 = 8
Since sum equals product, it is a Spy Number.*/

import java.util.*;

public class Que28{
   public static void main(String[] x){
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Input:");
      int n = sc.nextInt();
      
      int sum = 0;
      int product = 1;
      
      for(; n != 0; n=n/10){
         int digits = n % 10;
         sum = sum + digits;
         product = product * digits;
         }
      
      if(sum == product){
      	  System.out.println("Neon Number");
         }else
         System.out.println("Not a neon number");
      }
   }
