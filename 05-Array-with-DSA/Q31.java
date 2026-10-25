/**

Question 31: Replace First and Last Element with 0.
Asked In Practice assignment

Input:
Array = [5, 3, 7, 2]

Output:
Array = [0, 3, 7, 0]

Explanation:
Update the first and last positions of the array with 0 and leave the middle elements unchanged.

**/

public class Q31
{
   public static void main(String[] x)
   {
      int a[] = {5,3,7,2};
      
      a[0] = 0;
      a[a.length-1] = 0;
      
      System.out.print("Array: ");
      for(int i=0 ; i<a.length ; i++)
      {
         System.out.print(a[i] + " ");
      }
   }
}
