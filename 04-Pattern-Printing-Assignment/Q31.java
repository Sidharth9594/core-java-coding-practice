/**
Q31. Write a java program to print this pattern.

					*
				#	#
			*	*	*
		#	#	#	#
	*	*	*	*	*

**/

public class Q31
{
   public static void main(String[] x)
   {
      for(int i=1 ; i<=5 ;i++)
      {
         for(int j=1 ; j<=5 ; j++)
         {
            if(j>=6-i)
               if(i%2==0)
                  System.out.print(" #   ");
               else
                  System.out.print(" *   ");
            else
               System.out.print("     ");
         }
         System.out.println();
      }
   }
}
