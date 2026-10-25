/*Question 2: Write a Java program to input all basic data types (int, float, double, char, boolean) and print their values.
Asked In Basic program
Input:
int = 10
float = 5.5
double = 99.99
char = A
boolean = true

Output:
10
5.5
99.99
A
true

Explanation:
The program accepts values of different data types and displays them using appropriate variables and print statements.*/

/*
public class que2{
	public static void main(String args[]){
		int a = 10;
		float b = 5.5f;
		double c = 99.99;
		char d = 'A';
		boolean e = true;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
}  */

/*
public class que2{
	public static void main(String x[]){
		int a = Integer.parseInt(x[0]);
		float b = Float.parseFloat(x[1]);
		double c = Double.parseDouble(x[2]);
		char d = x[3].charAt(0);
		boolean e = Boolean.parseBoolean(x[4]);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
} */

public class que2{
	public static void main(String x[]){
		int a = 5;
		float b = 5.5f;
		double c = 55.56;
		char d = 's';
		boolean e = true;
		
		System.out.println("*****************Output*****************");
		System.out.println("Output of Integer: "+a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
	}
}


