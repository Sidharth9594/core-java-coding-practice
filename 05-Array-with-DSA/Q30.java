/**

Question 30: Replace All Elements Divisible by 3 with -1.
Asked In Practice assignment

Input:
Array = [3, 6, 7, 9, 10]

Output:
Array = [-1, -1, 7, -1, 10]

Explanation:
Traverse the array and if an element is divisible by 3 replace it with -1 while keeping other elements unchanged.
**/

public class Q30
{
   public static void main(String[] x)
   {
      int a[] = {3 , 6 , 7 , 9 , 10};
      
      System.out.print("Array: ");
      for (int i=0 ; i<a.length ; i++)
      {
         if(a[i] % 3 == 0)
         {
            a[i] = -1;
         }
         System.out.print(a[i] + " ");
      }
   }
}
