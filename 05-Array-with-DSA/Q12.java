/**

Question 12: Write a program in java to insert an element at desired position from an array.
Asked In Practice assignment

Input the size of array : 6

	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	
	Input the position where to insert : 2
	Value :      200

	Expected Output : The new list is : 1 2 200 3 4 5

**/

import java.util.*;

public class Q12
{
   public static void main(String[] x)
   {
      Scanner sc = new Scanner(System.in);
      
      int a[] = new int[5];
      int b[] = new int[6];
      
      System.out.print("Array : ");
      for(int i=0 ; i<a.length ; i++)
      {
         a[i] = sc.nextInt();
      }
      
      System.out.print("Input the position where to insert: ");
      int position = sc.nextInt();
      position = position - 1 ;
      
      System.out.print("Value: ");
      int value = sc.nextInt();
      
      
      for(int i=0 ; i<b.length ; i++)
      {
         if(i==position)
         {
            b[i] = value;
         }
         else if(i<position)
         {
            b[i] = a[i];
         }
         else
         b[i] = a[i-1];
      }
      
      System.out.print("The  new list is: ");
      for(int i=0 ; i<b.length ; i++)
      {
         System.out.print(b[i] + " ");
      }
   }
}
