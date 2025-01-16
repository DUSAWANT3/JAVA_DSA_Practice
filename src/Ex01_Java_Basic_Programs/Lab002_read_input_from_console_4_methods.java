package Ex01_Java_Basic_Programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//In Java, there are four different ways to read input
// from the user in the command line environment(console).

public class Lab002_read_input_from_console_4_methods {

    public static void main(String[] args)
            throws IOException{
//1-Using Scanner Class
        // Using Scanner for Getting Input from User
      /*  Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        System.out.println("You entered string " + s);

        int a = in.nextInt();
        System.out.println("You entered integer " + a);

        float b = in.nextFloat();
        System.out.println("You entered float " + b); */

        System.out.println("*********************************************************");

  // 2-Using Buffered Reader Class
  //throws IOException
        // Enter data using BufferReader
        System.out.println("enter the name:  ");

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        String name = reader.readLine();

        // Printing the read line
        System.out.println(name);

        System.out.println("*********************************************************");

 // 3- Using Console Class
        System.out.println("enter the name:  ");
        // Using Console to input data from user
        String name = System.console().readLine();

        System.out.println("You entered string " + name);
    }

}
