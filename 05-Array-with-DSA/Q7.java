/**

Question 7: Write a java program to display the reverse array.
Asked In Practice assignment

Input : Array = {1, 2, 3, 4, 5}
Output : Reverse array = {5, 4, 3, 2, 1}
Explanation :
The last element becomes the first, and the first becomes the last by traversing from the end to the start.

**/

import java.util.*;

public class Q7
{
   public static void main(String[] x)
   {
      Scanner sc = new Scanner(System.in);
      
      int a[] = new int [5];
      
      System.out.print("Array: ");
      for(int i=0 ; i<a.length ; i++)
      {
         a[i] = sc.nextInt();
      }
      
      System.out.print("Reverse array: ");
      for(int i=a.length-1 ; i>=0 ;i--)
      {
         System.out.print(a[i] + " ");
      }
   }
}
