/**

Question 35: Create a new array where each element is the square of the original.
Asked In Practice assignment

Input:
Array = [2, 4, 6, 8]

Output:
New Array = [4, 16, 36, 64]

Explanation:
For each index multiply the element with itself and store the result in a new array.
**/

public class Q35
{
   public static void main(String[] x)
   {
      int a[] = {2,4,6,8};
      int b[] = new int[4];
      
      System.out.print("New Array: ");
      for(int i=0 ; i<a.length ; i++)
      {
         b[i] = a[i] * a[i] ;
         System.out.print(b[i] + " ");
      }
   }
}
