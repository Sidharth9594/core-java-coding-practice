/**
Q22. Write a java program to print this pattern.

			*
		     *       *
		 *	*        *
	     *      *        *        *
	*	*	*	*        *

**/

public class Q22
{
   public static void main(String[] x)
   {
      for(int i=1 ; i<=5 ; i++)
      {
         for(int j=1 ; j<=9 ; j++)
         {
            if(j%2==i%2 && j>=6-i && j<=4+i)
               System.out.print(" * ");
            else
               System.out.print("   ");
         }
         System.out.println();
      }
   }
}
