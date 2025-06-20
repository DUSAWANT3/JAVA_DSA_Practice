package Ex01_Java_Basic_Programs;

import java.util.Scanner;

public class Ex01_Read_and_Print_Integer_value {
    public static void main(String[] args) {
        // Declare the variables
        int num;

        // Input the integer
        System.out.println("Enter the integer: ");

        // Create Scanner object
        Scanner s = new Scanner(System.in);

        // Read the next integer from the screen
        num = s.nextInt();
        // Note: If the input is not an integer,it will throw an InputMismatchException

        // Display the integer
        System.out.println("Entered integer is: " + num);

        // Close the Scanner object
        s.close(); // Important to prevent resource leaks
    }
}

