/**

Question 22: Write a Java program to check whether two integer arrays are equal.
Two arrays are considered equal if:
Asked In Practice assignment

Input:
Array1 = [10, 20, 30, 40]
Array2 = [10, 20, 30, 40]

Output:
Arrays are equal.

Explanation:
First compare the lengths of both arrays and if they are equal then compare elements at each index; if all elements match the arrays are equal otherwise they are not.

**/

import java.util.*;

public class Q22
{
   public static void main(String[] x)
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Size of Array1: ");
      int n = sc.nextInt();
      int a[] = new int[n];
      
      System.out.print("Array1: ");
      for(int i = 0 ; i<a.length ; i++)
      {
         a[i] = sc.nextInt();
      }
      
      System.out.print("Size of Array2: ");
      int m = sc.nextInt();
      int b[] = new int[m];
      
      System.out.print("Array2: ");
      for(int i = 0 ; i<a.length ; i++)
      {
         b[i] = sc.nextInt();
      }
      
      int equal = 1;
      
      if(a.length != b.length)
      {
         equal = 0;
      }
      else
      {
         for(int i=0 ; i<a.length ; i++)
         {
            if(a[i] != b[i])
            {
               equal = 0;
            }
         }
      }
      
      if(equal == 1)
         System.out.println("Arrays are Equal");
      else
         System.out.println("Arrays are not Equal");
   }
}
