/**

Question 20: Write a Java program to print all elements from an integer array that are greater than a given number.
Asked In Practice assignment

Input:
Array = [10, 25, 5, 40, 18]
Given Number = 20

Output:
Elements greater than 20: 25 40

Explanation:
Traverse the array and compare each element with the given number; if the element is greater than the number, print it.

**/

import java.util.*;

public class Q20
{
   public static void main(String[] x)
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Size of Array: ");
      int n = sc.nextInt();
      
      int a[] = new int[n];
      
      System.out.print("Array: ");
      for(int i=0 ; i<a.length ; i++)
      {
         a[i] = sc.nextInt();
      }
      
      System.out.print("Given Number: ");
      int given = sc.nextInt();
      
      System.out.print("Elements Greater then " + given + ": ");
      for(int i=0 ; i<a.length ; i++)
      {
         if(a[i] > given)
         {
            System.out.print(a[i] + " ");
         }
      }
   }
}
