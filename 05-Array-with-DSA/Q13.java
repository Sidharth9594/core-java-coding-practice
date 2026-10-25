/**


Question 13: Write a java program to display only non-zero values from an array.
Asked In Practice assignment

Input : Array = {1, 0, 5, 0, 7, 0, 9}
Output : Non-zero elements = {1, 5, 7, 9}
Explanation :
Traverse the array and print only elements that are not equal to zero.

**/

import java.util.*;
public class Q13
{
   public static void main(String[] x)
   {
     Scanner sc = new Scanner(System.in);
     
     int a[] = new int[7];
     
     System.out.print("Array: ");
     for(int i=0 ; i<a.length ; i++)
     {
        a[i] = sc.nextInt();
     }
     
     System.out.print("Non-Zero Elements: ");
     for(int i=0 ; i<a.length ; i++)
     {
        if(a[i] != 0)
        {
           System.out.print(a[i] + " ");
           
        }
     }  
   }
}
