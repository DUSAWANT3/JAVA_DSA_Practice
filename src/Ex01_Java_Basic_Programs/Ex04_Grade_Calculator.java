package Ex01_Java_Basic_Programs;

import java.util.Scanner;

public class Ex04_Grade_Calculator {
    public static void main(String[] args) {
        //Write a program that calculates and displays the letter grade for a given numerical score
        // (e.g., A, B, C, D, or F) based on the following grading scale:
        //A: 90-100  || B: 80-89 ||  C: 70-79 ||  D: 60-69 || F: 0-59

        //take a input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1 to 100 any =  ");
        int score = sc.nextInt();

        char grade = 0;
        // Validate input and determine grade
        if (score < 0 || score > 100) {
            System.out.println("Invalid score. Please enter a number between 0 and 100.");
        } else if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Your grade is: " + grade);
    }
}

