/**

Question 36: Replace each element with its factorial.
Asked In Practice assignment

Input:
Array = [3, 4, 5]

Output:
Array = [6, 24, 120]

Explanation:
For every element compute the factorial by multiplying all numbers from 1 to that element and update the array with the result.

**/

public class Q36
{
   public static void main(String[] x)
   {
      int a[] = {3,4,5};
      
      System.out.print("Array: ");
      for(int i=0 ; i<a.length ; i++)
      {
         int fact = 1;
         for(int j=1 ; j<=a[i] ; j++)
         {
            fact = fact * j ;
         }
         a[i] = fact ;
         System.out.print(a[i] + " ");
      }
   }
}
