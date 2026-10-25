/**

Question 41: Write a program in java to find the smallest missing element from a sorted array?
Asked In Practice assignment

Input:
Array = [0, 1, 3, 4, 5, 6, 7, 9]

Output:
Smallest Missing Element = 2

Explanation:
Traverse the array and compare each element with its expected index value; the first mismatch indicates the missing number.
**/

import java.util.*;

public class Q41
{
   public static void main(String[] x)
   {
      Scanner sc = new Scanner(System.in);
      
      int a[] = new int[8];
      
      System.out.print("Array: ");
      for(int i=0 ; i<a.length ; i++)
      {
         a[i] = sc.nextInt();
      }
      
      System.out.print("Smallest Missing Element: ");
      for(int i=0 ; i<a.length ; i++)
      {
         if(a[i] != i)
         {
            System.out.println(i);
            break;
         }
      }
   }
}
