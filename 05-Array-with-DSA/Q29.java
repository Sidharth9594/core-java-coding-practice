/**

Question 29: Rearrange the array so that even and odd numbers alternate. Assume the number of even and odd elements is equal.
Asked In Practice assignment

Input:
Array = [1, 2, 3, 4, 5, 6]

Output:
Array = [2, 1, 4, 3, 6, 5]

Explanation:
Place an even number first followed by an odd number repeatedly until all elements are arranged alternately.
**/

import java.util.*;

public class Q29
{
   public static void main(String[] x)
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Size of Array: ");
      int n = sc.nextInt();
      
      int a[] = new int[n];
      int b[] = new int[n];
      
      System.out.print("Array: ");
      for(int i=0 ; i<a.length ; i++)
      {
         a[i] = sc.nextInt();
      }
      
      int s=0;
      for(int i=0 ; i<a.length ; i++)
      {
         if(a[i] % 2 == 0)
         {
            b[s] = a[i];
            s = s + 2 ;	
         }
      }
      
      s=1;
      for(int i=0 ; i<a.length ; i++)
      {
         if(a[i] % 2 != 0)
         {
            b[s] = a[i];
            s = s + 2 ;	
         }
      }
      
      System.out.print("Rearrange Array: ");
      for(int i=0 ; i<a.length ; i++)
      {
         System.out.print(b[i] + " ");
      }
   }
}
