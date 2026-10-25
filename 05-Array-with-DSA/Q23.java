/**

Question 23: Write a Java program to find the Majority Element of an array.
A majority element in an array of size n is an element that appears more than n/2 times. There can be at most one majority element in the array.
Asked In Practice assignment

Input:
Array = [4, 8, 4, 6, 7, 4, 4, 8]

Output:
Majority Element = 4

Explanation:
Count the occurrences of every element using nested traversal and if any element appears more than n/2 times it is the majority element.
**/

import  java.util.*;

public class Q23
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
      
      int found = 0;
      for(int i=0 ; i<a.length ; i++)
      {
         int count = 0;
         
         for(int j=0 ; j<a.length ; j++)
         {
            if(a[i] == a[j])
            {
               count++;
            }
         }
         if(count > a.length/2)
         {
            System.out.println("Majority Element: "+ a[i]);
            found = 1;
            break;
         }
      }
      if (found == 0)
         System.out.println("Majority element not found");
   }
}
