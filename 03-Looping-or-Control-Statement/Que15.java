/*Question 15: Write a java program to print all ASCII characters with their values.
Asked In Just Practice assignment
Input:

No input required

Output (Sample):

A = 65
B = 66
...

Explanation:

The program uses a loop from 0 to 127.
Each number is converted to its corresponding character and printed.*/

public class Que15{
	public static void main(String x[]){
		
		
		
		for(int i = 0; i <= 127; i++){
			char ch = (char) i;
			System.out.println(i + " = " + ch);
			
		}
	}
}