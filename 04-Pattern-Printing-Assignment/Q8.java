/**Write a java program to print this pattern.

#
#	*
#	*	#
#	*	#	*
#	*	#	*	#


**/

public class Q8
{
   public static void main(String[] x)
   {
      for(int i = 1;i<=5;i++)
      {
         for (int j = 1;j<=i;j++)
         {
            if(j%2 != 0 )
            {
               System.out.print("#");
            }
            else 
            {
               System.out.print("*");
            }
         }
      System.out.println();
      }
   }
}
