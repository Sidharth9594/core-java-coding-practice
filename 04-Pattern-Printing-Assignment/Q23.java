/**
Q23. Write a java program to print this pattern.

	#
	#	*
	#	*	#
	#	*	#	*
	#	*	#	*	#
	#	*	#	*
	#	*	#	
	#	*
        #
**/


public class Q23
{
   public static void main(String[] x)
   {
      for(int i=1 ; i<=9 ; i++)
      {
         for(int j=1 ; j<=5 ; j++)
            {
               if(i<=5 && j<=i)
               {
                  if(j % 2 != 0)
                     System.out.print(" # ");
                  else
                     System.out.print(" * ");
               }
               else if(i>5 && j<=10 - i)
               {
                  if(j % 2 != 0)
                     System.out.print(" # ");
                  else
                     System.out.print(" * ");
               }
               else
                  System.out.print("   ");
            }
            System.out.println();
      }
   }
}
