/**

Question 19: Given an integer array, replace all the negative numbers in the array with 0 and print the updated array.
Asked In Practice assignment

Input:
Array = [5, -3, 7, -1, 0, -6, 4]

Output:
Updated Array = [5, 0, 7, 0, 0, 0, 4]

Explanation:
Traverse the array and check each element; if the element is negative replace it with 0, otherwise keep it unchanged, then print the modified array.
**/

import java.util.*;

public class Q19
{
   public static void main(String[] x)
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Size of Array: ");
      int n =sc.nextInt();
      
      int a[] = new int[n];
      
      System.out.print("Array: ");
      for(int i=0 ; i<a.length ; i++)
      {
         a[i] = sc.nextInt();
         
         if(a[i] < 0)
         {
            a[i] = 0;
         }
      }
      System.out.print("Updated Array: ");
      for(int i=0 ; i<a.length ; i++)
      {
         
         System.out.print(a[i] + " ");
      }
   }
}
