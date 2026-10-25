/**
Question 16: Write a Java program to calculate the average of all elements present in an integer array.
Asked In Practice assignment

Input Array:
 [10, 20, 30, 40, 50]
Output:
 Average of array elements = 30Explanation
?	The average of array elements is calculated by:
 Average=Sum of all elementsNumber of elements\text{Average} = \frac{\text{Sum of all elements}}{\text{Number of elements}}Average=Number of elementsSum of all elements
?	First, iterate through the array and add all elements to a variable sum.
?	Then divide sum by the total number of elements (array.length) to get the average
**/

import java.util.*;

public class Q16
{
   public static void main(String[] x)
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("No. of values: ");
      int n = sc.nextInt();
      
      int a[] = new int[n];
      
      System.out.print("Array: ");
      for(int i=0 ; i<a.length ; i++)
      {
         a[i] = sc.nextInt();
      }
      int sum = 0;
      int average = 0;
      for(int i=0 ; i<a.length ; i++)
      {
         sum = (sum + a[i]);
      } 
      average = sum/n;
      System.out.print("Avearage of an Arry elements: " + average);
   }
}
