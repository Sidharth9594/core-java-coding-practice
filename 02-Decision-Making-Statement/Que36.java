/*Question 36: Write a Java program to check whether a person is a Child, Teenager, Adult, or Senior Citizen based on the given age.
Asked In Just Practice assignment
Input:
Age = 16

Output:
Teenager

Explanation:
Age < 13: Category = Child
Age >= 13 and Age <= 19: Category = Teenager
Age >= 20 and Age <= 59: Category = Adult
Age 60+: Category = Senior

Since Age = 16, the person is categorized as Teenager.*/

import java.util.*;

public class Que36{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Age: ");
		int Age = sc.nextInt();
		
		if (Age < 13){
			System.out.println("Child");
		} else if (Age >= 13 && Age <= 19){
			System.out.println("Teenager");
		} else if (Age >= 20 && Age <= 59){
			System.out.println("Adult");
		} else 
			System.out.println("Senior");
	}
}