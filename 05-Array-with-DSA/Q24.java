/**

Question 24: Write a program in java to rotate an array by N positions ?
Asked In Practice assignment

Input:
Array = [0, 3, 6, 9, 12, 14, 18, 20, 22, 25, 27]
Position = 4

Output:
Rotated Array = [12, 14, 18, 20, 22, 25, 27, 0, 3, 6, 9]

Explanation:
Split the array into two parts at the given position and place the second part first followed by the first part to complete the rotation.
**/

import java.util.*;

public class Q24
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
      
      System.out.print("position: ");
      int position = sc.nextInt();
      
      int s = 0;
      
      for(int i=position ; i<a.length ; i++)
      {
         b[s] = a[i];
         s++;
      }
      
      System.out.print("Rotated Array(raw): ");
      for(int i=0 ; i<b.length ; i++)
      {
         System.out.print(b[i] + " ");
      }
      
      for(int i=0 ; i<position ; i++)
      {
         b[s] = a[i];
         s++;
      }
      
      System.out.print("\nRotated Array: ");
      for(int i=0 ; i<b.length ; i++)
      {
         System.out.print(b[i] + " ");
      }
   }
}
