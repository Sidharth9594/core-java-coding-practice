/**

Question 1: Write a Java program to input an array & display it.
Asked In Practice assignment

Input:
 Array Size = 5
 Array Elements = 10 20 30 40 50
Output:
 10 20 30 40 50
Explanation:
?	First, we take the size of the array from the user.
?	Then, elements are entered one by one into the array.
?	Finally, using a loop, we display all elements in the same order they were entered.

**/

import java.util.*;
public class Q1
{
   public static void main(String[] x)
   {
      Scanner sc = new Scanner(System.in);
      
      int a[] = new int[5];
      
      System.out.println("Enter Values Of Array:");
      
      for(int i=0 ; i<a.length ; i++)
      {
         a[i] = sc.nextInt();
      }
      
      System.out.println("Array Values:");
      for(int i=0 ; i<a.length ; i++)
      {
         System.out.println( "a[" + i +"] : " + a[i] + " ");
      }
   }
}
