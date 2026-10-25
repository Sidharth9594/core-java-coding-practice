/**
Q39. Write a java program to print this pattern.

	E	E	E	E	E
	D	D	D	D
	C	C	C
	B	B
	A


**/

public class Q39
{
   public static void main(String[] x)
   {
      char ch = 'E';
      
      for(int i=1 ; i<=5 ; i++)
      {
         for(int j=1 ; j<=5 ; j++)
         {
            if(i<=j)
               System.out.print(ch + "  ");
            else
               System.out.print("");
         }
         System.out.println();
         ch--;
      }
   }
}
