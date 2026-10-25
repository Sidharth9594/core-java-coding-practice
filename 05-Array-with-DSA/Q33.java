/**

Question 33: Check whether the given array is a palindrome.
Asked In Practice assignment

Input:
Array = [1, 2, 3, 2, 1]

Output:
true

Explanation:
Compare the first element with the last, the second with the second-last and continue until the middle; if all pairs match the array is a palindrome.
**/

public class Q33
{
   public static void main(String[] x)
   {
      int a[] = {1,2,3,2,1};
      int flag = 1;
      for(int i=0 ; i<a.length ; i++)
      {
         if(a[i] != a[a.length - 1 - i])
         {
            flag = 0;
         }
      }
      
      if(flag == 1)
         System.out.println("True");
      else
         System.out.println("False");
   }
}
