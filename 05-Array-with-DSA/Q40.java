/**

Question 40: Write a Java program to sort a given array in ascending & descending order.
Asked In Practice assignment

Input:
Array = [12, 5, 9, 34, 1]

Output:
Ascending Order = [1, 5, 9, 12, 34]
Descending Order = [34, 12, 9, 5, 1]

Explanation:
Arrange elements from smallest to largest for ascending order and reverse the order for descending.

**/

import java.util.*;

public class Q40
{
   public static void main(String[] x)
   {
      Scanner sc = new Scanner(System.in);
      
      int a[] = new int[5];
      
      System.out.print("Array: ");
      for(int i=0 ; i<a.length ; i++)
      {
         a[i] = sc.nextInt();
      }
      
      System.out.print("Ascending Order: ");
      for(int i=0 ; i<a.length ; i++)
      {
         for(int j=i+1 ; j<a.length ; j++)
         {
            if(a[i] > a[j])
            {
               int temp = a[i];
               a[i] = a[j];
               a[j] = temp;
            }
         }
         System.out.print(a[i] + " ");
      }
      
      System.out.print("\nDescending Order: ");
      for(int i=a.length-1 ; i>=0 ; i--)
      {
         System.out.print(a[i] + " ");
      }
   }
}
