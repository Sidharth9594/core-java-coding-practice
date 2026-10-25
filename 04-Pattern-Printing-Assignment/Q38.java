/**
Q38. Write a java program to print this pattern.

	A
	B	B
	C	C	C	
	D	D	D	D
	E	E	E	E	E

**/

public class Q38
{
   public static void main(String[] x)
   {
      char ch = 'A';
      
      for(int i=1 ; i<=5 ; i++)
      {
         char temp=ch;
         for(int j=1 ; j<=5 ; j++)
         {
            if(j<=i)
               System.out.print(temp + "  ");
            else
               System.out.print("");
         }
         System.out.println();
         ch++;
      }
   }
}
