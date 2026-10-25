/**

Question 17: Write a Java program to count the number of even and odd elements present in a given integer array.
Asked In Practice assignment

Input :- Array = { 10, 15, 20, 25, 30 }
Output :- Even count = 3
    Odd count = 2                                                     
        Explanation
?	An even number is a number that is completely divisible by 2.
?	An odd number is a number that is not divisible by 2.
?	Traverse the array using a loop.
**/

import java.util.*;

public class Q17
{
   public static void main(String[] x)
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("No. of elements: ");
      int n = sc.nextInt();
      
      int a[] = new int[n];
      int Even_Count = 0;
      int Odd_Count = 0;
      
      System.out.print("Array: ");
      for(int i=0 ; i<a.length ; i++)
      {
         a[i] = sc.nextInt();
         
         if(a[i] % 2 == 0)
         {
            Even_Count++;
         }
         else
         {
            Odd_Count++;
         }
      }
      
      System.out.println("Even Count: " + Even_Count);
      System.out.println("Odd_Count: " + Odd_Count);
   }
}
