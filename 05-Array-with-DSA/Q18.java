/**

Question 18: Write a Java program to check whether a given array is empty or not.
Asked In Practice assignment

Input :- Array elements: { }                            Explanation
1.	Every array has a predefined property called length.
2.	If array.length == 0, then the array is empty.
3.	Otherwise, the array contains elements.
Output :- Array is empty

**/

import java.util.*;

public class Q18
{
   public static void main(String[] x)
   {
      Scanner sc = new Scanner(System.in);
      
      int a[] = {};
      
      if(a.length == 0)
      {
         System.out.println("Array Is Empty");
      }
      else
         System.out.println("Array Is not Empty");
   }
}
