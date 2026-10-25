/**

Question 10: Write a program in java to delete an element at desired position from an array.
Asked In Practice assignment

Input the size of array : 5

	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	
	Input the position where to delete : 3

	Expected Output : The new list is : 1 2 3 5
**/

import java.util.*;

public class Q10
{
   public static void main(String[] x)
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter Size of Array: ");
      int n=sc.nextInt();
      
      int a[] = new int[n];
      
      System.out.print("Array: ");
      for(int i=0 ; i<a.length ; i++)
      {
         a[i] = sc.nextInt();
      }
      
      System.out.print("input position Where to delete: ");
      int s = sc.nextInt();
      
      for(int i = s-1 ; i<a.length-1 ; i++)
      {
         a[i] = a[i+1];
      }
      System.out.print("The new List is: ");
      for(int i=0 ; i<a.length-1 ; i++)
      {
         System.out.print(a[i] +" ");
      }
   }
}
