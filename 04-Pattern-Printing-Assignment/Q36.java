/**
Q36. Write a java program to print this pattern.

A	B	C	D	E
A	B	C	D	E
A	B	C	D	E	
A	B	C	D	E
A	B	C	D	E 

**/

public class Q36
{
   public static void main(String[] x)
   {
      for(int i=1 ; i<=5 ; i++)
      {
         char ch= 'A';
         
         for(int j=1 ; j<=5 ; j++)
         {
            System.out.print(ch + "  ");
            ch++;
         }
         System.out.println();
      }
   }
}
