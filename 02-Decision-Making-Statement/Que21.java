/*Question 21: Write a java program to check whether a number is neon or not neon without using loop.
Asked In Just Practice assignment
Input:
Number = 9

Output
Neon Number

Explanation:
Square of 9 = 9 * 9 = 81
Sum of digits of 81 = 8 + 1 = 9
Since sum (9) equals the original number (9), it is a Neon Number.*/

import java.util.*;

public class Que21 {
    public static void main(String x[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        int N = sc.nextInt();

        int square = N * N;

        int a = square % 10;
        int b = (square / 10) % 10;
        int c = square / 100;

        int total = a + b + c;

        if (N == total) {
            System.out.println("Neon Number");
        } else {
            System.out.println("It is not a Neon Number");
        }
    }
}