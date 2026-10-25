/**

Question 21: Given an integer array and a specific element, write a Java program to find the index position of that element in the array. If the element is not found, print -1.
Asked In Practice assignment

Input:
Array = [10, 20, 30, 40, 50]
Element to find = 30

Output:
Element found at index = 2

Explanation:
Traverse the array from index 0 and compare each element with the target value; when a match is found return its index otherwise return -1 if the element is not present.

**/

import java.util.*;

public class Q21
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
      
      System.out.print("Element to find: ");
      int find = sc.nextInt();
      int found = 0;
      
      for(int i=0 ; i<a.length ; i++)
      {
         if(a[i] == find)
         {
            System.out.print("Element found at Index: " + i);
            found = 1;
         }
      }
      
      if(found == 0)
         System.out.print("Element Not Found");
   }
}
