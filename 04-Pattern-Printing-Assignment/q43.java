/**
Q43. Write a java program to print this pattern.

	1	2	3	4	5
	2	2	3	4	5
	3	3	3	4	5
	4	4	4	4	5
	5	5	5	5	5

**/

public class q43    
{
   public static void main(String[] x)
   {
      for(int i=1 ; i<=5 ; i++)
      {
         for(int j=1 ; j<=5 ; j++)
         {
            if(i > j)
               System.out.print(i + "  ");
            else
               System.out.print(j + "  ");
         }
         System.out.println();
      }
   }
}
