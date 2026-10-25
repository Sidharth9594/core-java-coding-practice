/*
Question 29: Write a java program to display 1 to nth Prime Number.
Asked In Just Practice assignment

Input:

n = 5

Output:

2 3 5 7 11

Explanation:

Prime numbers are numbers divisible only by 1 and themselves.
The first 5 prime numbers are 2, 3, 5, 7, and 11.
*/

import java.util.*;

public class Que29
{
   public static void main(String[] x)
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Input: ");
      int n = sc.nextInt();
      System.out.print("Prime Numbers from 1 to "+n+" is: ");
      
      int count = 0;
      int i = 1;
      while(count<n)
      {
         int factor = 0;
         for(int j=1;j<=i;j++)
         {
            if(i%j==0)
            {
            factor++;
            }
         }
         if(factor==2)
         {
            System.out.print(i+" ");
         }
         count++;
         i++;
      }
   }
}
