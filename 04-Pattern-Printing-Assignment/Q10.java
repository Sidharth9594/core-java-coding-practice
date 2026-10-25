/**
Q10. Write a java program to print this pattern.
		
           	*  *  *  *  *  *  *  *  *
		   *  *  *  *  *  *  *
	             *   *  *  *  *
			*  *  *
			    *
**/

public class Q10
{
   public static void main(String[] x)
   {
      for(int i = 1 ; i<=5;i++)
      {
         for(int j = 1 ; j<=9;j++)
         {
            if(j>=2 * i - 1)
               System.out.print("* ");
            else
               System.out.print(" ");
         }
      System.out.println();
      }
   }
}
