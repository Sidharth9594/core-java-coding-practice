/*
Question 27: Write a java program to Check If a Number Is a Happy Number or Not.
Example : A number is called happy if it leads to 1 after a sequence of steps wherein each step number is replaced by the sum of squares of its digit, that is if we start with Happy Number and keep replacing it with digits square sum, we reach 1.
Asked In Just Practice assignment

Input:

Number = 19

Output:

Happy Number

Explanation:

1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
Since it reaches 1, it is a Happy Number.*/

import java.util.*;
public class Que27{
  public static void main(String[] x){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Input:");
    int n = sc.nextInt();
    
    int temp = n ;
    
    while(temp != 1 && temp != 4){
        int sum = 0;
        while(temp > 0){
            int digits = temp % 10;
            sum = sum + digits * digits;
            temp = temp / 10; 
            }
        temp = sum;
        }
    if(temp == 1){
        System.out.println("Happy Number");
        } else 
        System.out.println("Not a Happy Number");
    }
}
