/**
Q37. Write a java program to print this pattern.

	A	B	C	D	E
	B	C	D	E	F
	C	D	E	F	G
	D	E	F	G	H
	E	F	G	H	I

**/

public class Q37
{
   public static void main(String[] x)
   {
      char ch = 'A';
      for(int i=1 ; i<=5 ; i++)
      {
         char temp = ch;
         for(int j=1 ;j <=5 ;j++)
         {
            System.out.print(temp + "  ");
            temp++;
         }
         System.out.println();
         ch++;
      }
   }
}
