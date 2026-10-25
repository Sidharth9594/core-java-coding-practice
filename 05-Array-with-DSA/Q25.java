/**

Question 25: Move all zeros in an array to the end while maintaining the relative order of non-zero elements.
Asked In Practice assignment

Input:
Array = [0, 1, 0, 3, 12]

Output:
Array = [1, 3, 12, 0, 0]

Explanation:
Traverse the array and shift all non-zero elements forward while keeping their order the same, then place all zeros at the remaining positions at the end.

**/

import java.util.*;

public class Q25
{
   public static void main(String[] x)
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Size of Array:");
      int n = sc.nextInt();
      
      int a[] = new int[n];
      int b[] = new int[n];
      
      System.out.print("Array: ");
      for(int i=0 ; i<a.length ; i++)
      {
         a[i] = sc.nextInt();
      }
      
      System.out.print("Array: ");
      int s=0;
      for(int i=0 ; i<a.length ; i++)
      {  
         if(a[i] !=0)
         {
            b[s] = a[i];
            s++;
         }
      }
      
      for(int i=s ; i<b.length ; i++)
      {
         b[i] =0;
      }
      
      System.out.print("Array: ");
      for(int i=0 ; i<b.length ; i++)
      {
         System.out.print(b[i] + " ");
      }
   }
}
