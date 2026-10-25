/**
uestion 5: Write a Java program to count even & odd values from an array.
Asked In Practice assignment

Input:
 Array Size = 7
 Array Elements = 12 17 24 39 40 55 70
Output:
 Count of Even Values = 4
 Count of Odd Values = 3
Explanation:
?	Initialize counters: evenCount = 0, oddCount = 0.
?	For each element in the array:

?	If divisible by 2 ? increase evenCount.
?	Otherwise ? increase oddCount.

?	Final counts are displayed.
**/

import java.util.*;

public class Q5
{
   public static void main(String[] x)
   {
      Scanner sc = new Scanner(System.in);
      
      int a[] = new int[7];
      System.out.print("Values Of Array: ");
      
      for(int i=0 ; i<a.length ; i++)
      {
         a[i] = sc.nextInt();
      }
      
      int even_count = 0;
      int odd_count = 0;
      for(int i=0 ; i<a.length ; i++)
      {
         if(a[i] % 2 == 0)
         {
            even_count++;
         }
         else
         {
            odd_count++;
         }
      }
      System.out.println("Count of Even Values: " + even_count);
      System.out.println("Count of Odd Values: " + odd_count);
   }
}
