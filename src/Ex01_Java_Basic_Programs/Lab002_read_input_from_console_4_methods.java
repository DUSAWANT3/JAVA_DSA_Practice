package Ex01_Java_Basic_Programs;

import java.util.Scanner;

//In Java, there are four different ways to read input
// from the user in the command line environment(console).

public class Lab002_read_input_from_console_4_methods {

    public static void main(String[] args) {
//1-Using Scanner Class
        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        System.out.println("You entered string " + s);

        int a = in.nextInt();
        System.out.println("You entered integer " + a);

        float b = in.nextFloat();
        System.out.println("You entered float " + b);

    }

}
