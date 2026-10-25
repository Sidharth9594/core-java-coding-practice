/**

Question 37: Count the number of prime numbers in an array.
Asked In Practice assignment

Input:
Array = [2, 5, 6, 9, 11]

Output:
Count of Prime Numbers = 3

Explanation:
Check each element to see if it is divisible only by 1 and itself and count such numbers.
**/

public class Q37
{
   public static void main(String[] x)
   {
      int a[] = {2,5,6,9,11,7};
      int count = 0;
      
      for(int i=0 ; i<a.length ; i++)
      {
         int divisor = 0;
         
         for(int j=1 ; j<=a[i] ; j++)
         {
            if(a[i] % j == 0)
            {
               divisor++;
            }
         }
         
         if(divisor == 2)
         {
            count++;
         }
      }
      
      System.out.println("count of PRime NUmbers: "+ count);
   }
}
