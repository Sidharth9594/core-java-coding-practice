/**
Q46. Write a java program to print this pattern.

					1
				2		2
			3				3
		4						4
	5								5
		4						4
			3				3
				2		2
					1

**/

public class q46
{
   public static void main(String[] x)
   {
      for(int i=1 ; i<=9 ; i++)
      {
         int a;

         if(i<=5)
            a = i;
         else
            a = 10-i;

         for(int j=1 ; j<=9 ; j++)
         {
            if(j==6-a || j==4+a)
               System.out.print(a + "  ");
            else
               System.out.print("   ");
         }

         System.out.println();
      }
   }
}
