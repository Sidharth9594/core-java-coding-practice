/**
Q32. Write a java program to print this pattern.

*
# #
* * *
# # # #
* * * * *
# # # # # #

**/

public class Q32
{
   public static void main(String[] x)
   {
      for(int i=1 ; i<=6 ; i++)
      {
         for(int j=1 ; j<=6 ; j++)
         {
            if(i>=j)
               if(i%2==0)
                  System.out.print(" #   ");
               else
                  System.out.print(" *   ");
            else
               System.out.print("     ");
         }
         System.out.println();
      }
   }
}
