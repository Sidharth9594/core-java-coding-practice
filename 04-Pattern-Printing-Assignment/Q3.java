/**Q3. Write a java program to print this pattern.

	*	#	*	#	*
	*	#	*	#	*
	*	#	*	#	*
	*	#	*	#	*
	*	#	*	#	*
**/

public class Q3
{
   public static void main(String[] x)
   {
   for(int i = 1 ; i<=5 ; i++)
      {
      for(int j = 1 ; j<=5 ; j++)
         {
         if(j == 1 || j == 3 || j == 5)
            {
            System.out.print("* ");
            }
         else if (j == 2 || j == 4)
            {
            System.out.print("# ");
            }
         else
         System.out.print(" ");
         }
      System.out.println();
      }
   }
}
