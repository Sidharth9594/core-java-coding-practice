/**
Q40. Write a java program to print this pattern.

						A
					B	A
				C	B	A
			D	C	B	A
		E	D	C	B	A

**/

public class Q40
{
   public static void main(String[] x)
   {
      for(int i=1 ; i<=5 ; i++)
      {
         char ch =(char)('A' + i - 1);
         
         for(int j=1 ; j<=5 ; j++)
         {
            if(j >= 6-i)
            {
               System.out.print(ch + "  ");
               ch--;
            }
            else
               System.out.print("   ");
         }

         System.out.println();
      }
   }
}
