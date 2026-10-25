/**
Q38. Write a java program to print this pattern.
	
	1	*	*	*	*
	2	2	*	*	*
	3	3	3	*	*
	4	4	4	4	*
	5	5	5	5	5

**/

public class q38
{
   public static void main(String[] x)
   {
      for(int i=1 ; i<=5 ; i++)
      {
         for(int j=1 ; j<=5 ; j++)
         {
            if(j<=i)
            {
               System.out.print(i + " ");
               a++;
            }
            else
               System.out.print("* ");
         }
         System.out.println();
      }
   }
}
