/*
Question 25: Write a Java program to check whether a number is an Armstrong Number or not.
Asked In Just Practice assignment

Input:
Number = 153

Output:
Armstrong Number

Explanation:
An Armstrong number is a number whose sum of digits raised to the power of the number of digits is equal to the original number.

Example:
153 has 3 digits.

1^3 + 5^3 + 3^3 = 153

Since the result is equal to the original number, it is an Armstrong Number.
*/


import java.util.*;

public class Que25{
  public static void main(String[] x){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Input: ");
    int n = sc.nextInt();
    int temp = n;
    int count = 0;
    for(; temp > 0 ; temp = temp / 10){
      count++;
    }
    
    temp = n;
    int sum = 0;
    for(; temp > 0 ; temp = temp / 10){
      int digit = temp % 10;
      int power = 1;
      for(int i = 1 ; i <= count ; i++){
        power = power * digit ;
      }
      sum = sum + power ;
    }
    if (sum == n){
      System.out.println("Armstrong Number");
    }else
      System.out.println("Not a Armstrong Number");
  }
}
