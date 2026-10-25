/**
Q39. Write a java program to print this pattern.

	5	*	5	*	5
	4	*	4	*
	3	*	3
	2	*
	1

**/

public class q39
{
   public static void main(String[] x)
   {
      int a=5;
      for(int i=1 ; i<=5 ; i++)
      {
         
         for(int j=1 ; j<=5 ; j++)
         {
            if(j<=6-i)
            {
               if(j%2!=0)
                  System.out.print(a + " ");
               else
                  System.out.print("* ");
            }
            else
               System.out.print("  ");
         }
         a--;
         System.out.println();
      }
   }
}
