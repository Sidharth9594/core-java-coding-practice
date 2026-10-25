/**

Question 9: Write a java program to copy one array to another array.
Asked In Practice assignment

Input : Array1 = {5, 10, 15, 20}
Output : Array2 = {5, 10, 15, 20}
Explanation:
Copy each element of Array1 into Array2 using index-by-index assignment

**/

import java.util.*;

public class Q9
{
   public static void main(String[] x)
   {
      Scanner sc = new Scanner(System.in);
      
      int a[] = new int[5];
      int b[] = new int[5];
      
      System.out.print("Array1: ");
      for(int i=0 ; i<a.length ; i++)
      {
         a[i] = sc.nextInt();
      }
      
      for(int i=0 ; i<a.length ; i++)
      {
         b[i] = a[i];
      }
      
      System.out.println();
      System.out.print("Array2: ");
      for(int i=0 ; i<b.length ; i++)
      {
         System.out.print(b[i] + " ");
      }
   }
}
