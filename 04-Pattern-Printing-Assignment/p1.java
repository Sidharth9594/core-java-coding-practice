/**

1  
1  2
1  2  3
1  2  3  4
1  2  3  4  5

**/

public class p1
{
   public static void main(String[] x)
   {
      for(int i=1 ; i<=5 ; i++)
      {
         for(int j=1 ; j<=5 ; j++)
         {
            if(j<=i)
               System.out.print(j + " ");
            else
               System.out.print("");
         }
         System.out.println();
      }
   }
}
