/**
Q34. Write a java program to print this pattern.

	1
	2	3
	4	5	6
	7	8	9	10
	11	12	13	14	15

**/

public class q35
{
   public static void main(String[] x)
   {
      int a = 1;
      for(int i=1 ; i<=5 ; i++)
      {
         for(int j=1 ; j<=5 ; j++)
         {
            if(i>=j)
            {
               System.out.print(a + "  ");
               a++;
            }
            else
               System.out.print("  ");
         }
         System.out.println();
      }
   }
}
