/**
Q28. Write a java program to print this pattern.
					*
				*		*
			*		*		*
		*		*		*		*
	*		*		*		*		*
		*		*		*		*
			*		*		*
				*		*
					*

**/

public class Q28
{
   public static void main(String[] x)
   {
      for(int i=1 ; i<=9 ;i++)
      {
         for(int j=1 ; j<=9 ; j++)
         {
            if(i<=5 && j>=6-i && j<= 4+i && j%2==i%2)
               System.out.print(" *   ");
            else if(i>5 && j>=i-4 && j<=14-i && j%2==i%2)
               System.out.print(" *   ");
            else
               System.out.print("     "); 
         }
         System.out.println();
      }
   }
}
