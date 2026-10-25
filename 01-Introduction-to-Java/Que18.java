/*Question 18: Write a Java program to convert days into years, months, and weeks.
Asked In Basic program
Input:
Days = 400

Output:
Years = 1
Months = 1
Weeks = 1

Explanation:
1 year = 365 days.
After subtracting 365 days, the remaining days are divided into months (30 days each) and weeks (7 days each)*/

public class Que18 {
    public static void main(String x[]) {

        int Days = Integer.parseInt(x[0]);

        int Years = Days / 365;
        int Remain_Days = Days % 365;

        int Months = Remain_Days / 30;
        int Remain_Dayss = Remain_Days % 30;

        int Weeks = Remain_Dayss / 7;
        int Remaining_Days = Remain_Dayss % 7;

        System.out.println("Years = " + Years);
        System.out.println("Months = " + Months);
        System.out.println("Weeks = " + Weeks);
        System.out.println("Remaining Days = " + Remaining_Days);
    }
}