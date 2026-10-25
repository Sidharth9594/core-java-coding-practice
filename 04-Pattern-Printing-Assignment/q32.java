/**
Q32. Write a java program to print this pattern.

	1	2	3	4	5
	1	2	3	4	5
	1	2	3	4	5
	1	2	3	4	5
	1	2	3	4	5

**/

public class q32
{
   public static void main(String[] x)
   {
      for(int i=1 ; i<=5 ; i++)
      {
         for(int j=1 ; j<=5 ; j++)
         {
            System.out.print(j + "  ");
         }
         System.out.println();
      }
   }
}
