/**

Question 11: Write a java program to give an array, find the second largest element.
Asked In Practice assignment

Input : Array = {12, 35, 1, 10, 34, 1}
Output : Second largest = 34
Explanation:
First largest is 35, second largest is the next maximum (34). We maintain two variables (largest, secondLargest).

**/

import java.util.*;

public class Q11
{
   public static void main(String[] x)
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Size of The Array: ");
      int n = sc.nextInt();
      
      int a[] = new int[n];
      
      System.out.print("Array: ");
      for(int i=0 ; i<a.length ; i++)
      {
         a[i] = sc.nextInt();
      }
      
      int largest = a[0];
      for(int i=1 ; i<a.length ; i++)
      {
         if(a[i] > largest)
         {
            largest = a[i];
         }
      }
      System.out.println("largest element: " + largest);
      
      int Second_largest = a[0];
      for(int i=1 ; i<a.length ; i++)
      {
         if(a[i] > Second_largest && a[i] != largest)
         {
            Second_largest = a[i];
         }
      }
      System.out.println("Second Largest Element: " + Second_largest);
   }
}
