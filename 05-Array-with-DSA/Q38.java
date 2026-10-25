/**

Question 38: Count the number of Perfect numbers in an array.
Asked In Practice assignment

Input:
Array = [6, 28, 10, 12, 496]

Output:
Count of Perfect Numbers = 3

Explanation:
For each element calculate the sum of its divisors and if the sum equals the number then it is a perfect number.
**/

public class Q38
{
   public static void main(String[] x)
   {
      int a[] = {6,28,10,12,496};
      int count = 0;
      
      for(int i=0 ; i<a.length ; i++)
      {  
      	 int sum =0;
         for(int j=1 ; j<-1a[i] ; j++)
         {
            if(a[i] % j == 0)
            {
               sum = sum + j;
            }
         }
         
         if(sum == a[i])
         {
            count++;
         }
      }
      
      System.out.println("count of Perfect Numbers: "+ count);
   }
}
