/**
Q37. Write a java program to print this pattern.

	1	2	3	4	5	6	7	8	9
		1	2	3	4	5	6	7
			1	2	3	4	5	
				1	2	3
					1

**/

public class q37
{
   public static void main(String[] x)
   {
      for(int i=1 ; i<=5 ; i++)
      {
         int a=1;
         for(int j=1 ; j<=9 ; j++)
         {
            if( j>=i && j<= 10-i)
            {
               System.out.print(a + "   ");
               a++;
            }
            else
               System.out.print("    ");
         }
         System.out.println();
      }
   }
}
