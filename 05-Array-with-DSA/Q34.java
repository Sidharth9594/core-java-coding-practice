/**

Question 34: Return the first element that repeats in the array.
Asked In Practice assignment

Input:
Array = [10, 5, 3, 4, 3, 5, 6]

Output:
First repeating element = 5

Explanation:
Check elements from left to right and identify the element whose first occurrence appears earlier but repeats later in the array.
**/

public class Q34
{
   public static void main(String[] x)
   {
      int a[] = {10,5,3,4,3,5,6};
      int flag = 1;
      
      for (int i=0 ; i<a.length ; i++)
      {
         for(int j=i+1 ; j<a.length ; j++)
         {
            if(a[i] == a[j])
            {
               System.out.println("First Repeating Element: "+ a[i]);
               flag = 0;
               break;
            }
         }
         if(flag == 0)
         break;
      }
      
      if(flag==1)
         System.out.println("No Repeating Element");
   }
}
