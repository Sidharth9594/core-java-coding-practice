/**

Question 8: Write a java program to find missing elements in an array.
Asked In Practice assignment

Input : Array = {1, 2, 4, 5, 7} (numbers from 1 to 7 should be present)
Output : Missing elements = {3, 6}
Explanation:
Check sequence numbers one by one. If a number from 1 to maximum (7) is not in the array, it is missing.

**/

import java.util.*;

public class Q8
{
   public static void main(String[] x)
   {
      Scanner sc = new Scanner(System.in);
      
      int a[] = new int[5];
      
      System.out.print("Array : ");
      for(int i=0 ; i<a.length ; i++)
      {
         a[i] = sc.nextInt();
      }
      
      System.out.print("\nMissing Elements: ");
      for(int i=1 ; i<=7 ; i++)
      {
         int found =0;
         
         for(int j=0 ; j<a.length ; j++)
         {
            if (i == a[j])
            {
               found = 1;
            }
            
         }
          if(found == 0)
               System.out.print(i + " ");
      }
   }
}
