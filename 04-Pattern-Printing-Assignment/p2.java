/**

.            1
         1  2
      1  2  3   
   1  2  3  4
1  2  3  4  5

**/

public class p2
{
   public static void main(String[] x)
   {
      for(int i=1 ; i<=5 ; i++)
      {
         for(int j=1 ;j<=5 ; j++)
         {
            if(j<6-i)
               System.out.print("   ");
            else
               System.out.print((j-(5-i)) +"  ");
         }
         System.out.println();
      } 
   }
}
