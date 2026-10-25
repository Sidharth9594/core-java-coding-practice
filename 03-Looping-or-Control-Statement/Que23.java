/*Question 23: Write a java program to Check Number Is Duck Number or Not.
Example : A Duck number is a positive number which has zeroes present in it, For example 3210, 8050896, 70709 are all Duck numbers.
Please note that a number with only leading 0s is not considered a Duck Number.
For example, numbers like 035 or 0012 are not considered as Duck Numbers.
Asked In Just Practice assignment
Input:

Number = 3210

Output:

Duck Number

Explanation:

The number contains zero and does not start with zero.
Therefore, it is a Duck Number*/

import java.util.*;

public class Que23 {
    public static void main(String x[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        int n = sc.nextInt();

        int temp = n;
        int count = 0;

        while (temp > 0) {
            if (temp % 10 == 0) {
                count++;
            }
            temp = temp / 10;
        }

        if (count > 0) {
            System.out.println("Duck Number");
        } else {
            System.out.println("Not a Duck Number");
        }
    }
}