/**
Q18. Write a java program to print this pattern.


	*	*	*	*	*	*	
            *        *	     *      *       *        
		*	*	*	*
		     *       *       *
			 *        *
			      *

**/

public class Q18
{
   public static void main(String[] x)
   {
      for(int i=1 ; i<=6 ; i++)
      {
         for(int j=1 ; j<=11 ; j++)
         {
            if(j>=i && j<=12-i && j%2==i%2)
               System.out.print(" * ");
            else
               System.out.print("   ");
         }
         System.out.println();
      }
   }
}
