package Ex01_Java_Basic_Programs;

import java.util.Scanner;

public class Ex05_Leap_Year_Checker {
    public static void main(String[] args) {
        //Ex05-✅ Leap Year Checker:
        //Create a program that determines whether a given year is a leap year.
        // A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
        // Use an if-else statement to make this determination.

        //Get the input from User
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Year  = ");
        int year = sc.nextInt();

        boolean isLeapYear = false;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeapYear = true;
        }
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        sc.close();
    }
}