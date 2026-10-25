/**

Question 15: Write a java program to find common elements between two arrays.
Asked In Practice assignment

Input :
 Array1 = {1, 2, 3, 4, 5}
 Array2 = {3, 4, 5, 6, 7}
Output : Common elements = {3, 4, 5}
Explanation :
Compare each element of Array1 with all elements of Array2, if match found ? it is a common element.

**/

import java.util.*;

public class Q15
{
   public static void main(String[] x)
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Size of array: ");
      int n = sc.nextInt();
      
      int a[] = new int[n];
      int b[] = new int[n];
      
      System.out.print("Array1: ");
      for(int i=0 ; i<a.length ; i++)
      {
         a[i] = sc.nextInt();
      }
      
      System.out.print("Array2: ");
      for(int i=0 ; i<a.length ; i++)
      {
         b[i] = sc.nextInt();
      }
      
      int count = 1;
      
      System.out.print("Common Elements: ");
      for(int i=0 ; i<a.length ; i++)
      {
         for(int j=0 ; j<b.length ; j++)
         {
            if(a[i] == b[j])
            {
               System.out.print(a[i] + " ");
            }
         }
      }
   }
}
