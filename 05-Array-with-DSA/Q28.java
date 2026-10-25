/**

Question 28: Write a java program to find the union array of two unsorted arrays.
Asked In Practice assignment

Input:
Array1 = [1, 2, 3]
Array2 = [2, 3, 4, 5]

Output:
Union Array = [1, 2, 3, 4, 5]

Explanation:
Combine both arrays and remove duplicate elements so that each value appears only once.
**/

import java.util.*;

public class Q28
{
   public static void main(String[] x)
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Size of Array1: ");
      int n = sc.nextInt();
      
      int a[] = new int[n];
      
      System.out.print("Array1:");
      for(int i=0 ; i<a.length ; i++)
      {
         a[i] = sc.nextInt();
      }
      
      System.out.print("Size of Array2: ");
      int m = sc.nextInt();
      
      int b[] = new int[m];
      
      System.out.print("Array1:");
      for(int i=0 ; i<b.length ; i++)
      {
         b[i] = sc.nextInt();
      }
      
      int c[] = new int[n+m];
      int s = 0;
      
      for(int i=0 ; i<a.length ; i++)
      {
         c[s] =a[i];
         s++;
      }
      
      for(int i=0 ; i<b.length ; i++)
      {
         c[s] = b[i];
         s++;
      }
      
      System.out.print("Mixed Array: ");
      for(int i=0 ; i<c.length ; i++)
      {
         System.out.print(c[i] + " ");
      }
      
      System.out.print("\nUnion Array: ");
      for(int i=0 ; i<c.length ; i++)
      {
         boolean flag = true;
         for(int j=0 ; j<i ; j++)
         {
            if(c[i] == c[j])
            {
               flag = false;
            }
         }
         
         if (flag == true)
         {
            System.out.print(c[i] + " ");
         }
      }
   }
}
