/**
Q33. Write a java program to print this pattern.
	*								*
	*	*						*	*
	*	*	*				*	*	*
	*	*	*	*		*	*	*	*
  	*	*	*	*	*	*	*	*       *	   
	*	*	*	*		*	*	*	*
	*	*	*				*	*	*
	*	*						*	*
	*								*

**/

public class Q33
{
   public static void main(String[] x)
   {
      for(int i=1 ; i<=9 ; i++)
      {
         for(int j=1 ; j<=9 ; j++)
         {
            if(i<=5 && (j<=i || j>=10-i))
               System.out.print(" *   ");
            else if(i>5 && (j<=10-i ||j>=i))
               System.out.print(" *   ");
            else
               System.out.print("     ");
         }
         System.out.println();
      }
   }
}
