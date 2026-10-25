/**
Question 14: Write a java program to remove duplicated values from arrays.
Asked In Practice assignment

Input : Array = {10, 20, 20, 30, 40, 40, 50}
Output : Unique elements = {10, 20, 30, 40, 50}
Explanation:
Traverse the array, check if element already exists before adding to result, thus avoiding duplicates.
**/

import java.util.*;
public class Q14
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
      
      for(int i=0 ; i<a.length ; i++)
      {
         for(int j=0 ; j<i ; j++)
         {
            if(a[i] == a[j])
            {
               a[i] = 0;
            }
         }
      }
      
      System.out.print("Unique Elements: ");
      
      for(int i=0 ; i<a.length ; i++)
      {
         if(a[i] != 0)
         {
            System.out.print(a[i] + " ");
         }
      }
   }
}
