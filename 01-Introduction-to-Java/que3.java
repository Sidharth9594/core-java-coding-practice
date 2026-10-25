/*Question 3: Write a Java program to enter two numbers and perform addition, subtraction, multiplication, division, and modulus.
Asked In Basic program
Input:
Number1 = 20
Number2 = 5

Output:
Addition = 25
Subtraction = 15
Multiplication = 100
Division = 4
Modulus = 0

Explanation:
The program performs all basic arithmetic operations using the two given numbers and displays the results.*/

/*
public class que3{
	public static void main(String args[]){
		int a = 20;
		int b = 5;
		
		int add = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;
		int mod = a % b;
		System.out.println("Addition = "+add);
		System.out.println("Substractiion = "+sub);
		System.out.println("Multiplication = "+mul);
		System.out.println("Division = "+div);
		System.out.println("Modulus = "+mod);
	}
}  */

public class que3{
	public static void main(String x[]){
		int a = Integer.parseInt(x[0]);
		int b = Integer.parseInt(x[1]);
		
		int add = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;
		int mod = a % b;
		System.out.println("Addition = "+add);
		System.out.println("Substractiion = "+sub);
		System.out.println("Multiplication = "+mul);
		System.out.println("Division = "+div);
		System.out.println("Modulus = "+mod);
	}
}
