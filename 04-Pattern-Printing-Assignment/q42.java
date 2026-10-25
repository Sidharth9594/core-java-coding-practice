/**
Q42. Write a java program to print this pattern.

	1	2	3	4	5
	6	7	8	1	2
	3	4	5	6	7
	8	1	2	3	4	
	5	6	7	8	1

**/

public class q42
{
   public static void main(String[] x)
   {
      int a=1;
      for(int i=1 ; i<=5 ; i++)
      {
         for(int j=1 ; j<=5 ; j++)
         {
            System.out.print(a + "  ");
            a++;
            
            
            if (a>8)
            a=1;
         }
         System.out.println();
      }
   }
}
