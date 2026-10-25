/**
Q12. Write a java program to print this pattern.

	#	# 	#	#	#
	*	*	*	*
	#	#	#
	*	*
	#

**/

public class Q12
{
   public static void main(String[] x)
   {
      for(int i = 5 ; i>=1 ; i--)
      {
         for(int j = 1; j<=i; j++)
         {
            if (i%2!=0)
               System.out.print("# ");
            else 
               System.out.print("* ");
         }
       System.out.println();
      }
   }
}
	
