/**

Question 27: Write a java program to count the frequency of each element in a given array.
Asked In Practice assignment

Input:
Array = [1, 2, 2, 3, 3, 3, 4]

Output:
1 ? 1 time
2 ? 2 times
3 ? 3 times
4 ? 1 time

Explanation:
For each element in the array, count the number of occurrences by comparing it with all other elements.

**/

import java.util.*;

public class Q27
{
   public static void main(String[] x)
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Size of Array: ");
      int n = sc.nextInt();
      
      int a[] = new int[n];
      int visited[] = new int[n];
      
      System.out.print("Array: ");
      for(int i=0 ; i<a.length ; i++)
      {
         a[i] = sc.nextInt();
      }
      
      for(int i=0 ; i<a.length ; i++)
      {
         if(visited[i] == 1)
         {
            continue;
         }
         int count = 0;
         for(int j=0 ; j<a.length ; j++)
         {
            if( a[i] == a[j])
            {
               count++;
               visited[j] = 1;
            }
         }
         System.out.print("\n" + a[i] + " : " + count + "times");
      }
   }
}






/**

import java.util.*;

public class Q27
{
   public static void main(String[] x)
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Size of Array: ");
      int n = sc.nextInt();
      
      int a[] = new int[n];
      
      System.out.print("Array: ");
      for(int i=0 ; i<a.length ; i++)
      {
         a[i] = sc.nextInt();
      }
      
      for(int i=0 ; i<a.length ; i++)
      {
         int count = 1;
         if(a[i]!=0)
         {
         	for(int j=i+1 ; j<a.length ; j++)
         	{
            		if(a[i] == a[j])
            		{
               			count++;
               			a[j]=0;
            		}
         	}
         	
                  System.out.print("\n" + a[i] + " : " + count + " times");
                
         
         }
         
      }
   }
}
**/
