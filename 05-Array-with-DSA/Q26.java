/**
Question 26: Write a java program to count all pairs of elements in an array whose sum is equal to a given number.
Asked In Practice assignment

Input:
Array = [1, 5, 7, -1, 5]
Sum = 6

Output:
Number of Pairs = 3

Explanation:
Check all possible pairs in the array and count those pairs whose sum equals the given value.
**/

import java.util.*;

public class Q26
{
   public static void main(String[] x)
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Size of Array: ");
      int n = sc.nextInt();
      
      int a[] = new int[n];
      
      System.out.print("Array: ");
      for(int i=0 ; i<a.length ; i++)
      {
         a[i] = sc.nextInt();
      }
      System.out.print("Sum: ");
      int sum = sc.nextInt();
      int count = 0;
      for(int i=0 ; i<a.length ; i++)
      {
         for(int j=i+1 ; j<a.length ; j++)
         {
            if( a[i] + a[j] == sum)
            {
               count++;
            }
         }
      }
      System.out.println("No. of pairs: " + count); 
   }
}
