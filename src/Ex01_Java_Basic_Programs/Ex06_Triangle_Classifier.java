package Ex01_Java_Basic_Programs;

import java.util.Scanner;

public class Ex06_Triangle_Classifier {
    public static void main(String[] args) {
        //Ex06-Triangle Classifier:
        //Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides, determine if the triangle is equilateral(all sides are equal),
        // isosceles (exactly two sides are equal), or scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.

        Scanner sc = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter side 1: ");
        int side1 = sc.nextInt();

        System.out.print("Enter side 2: ");
        int side2 = sc.nextInt();

        System.out.print("Enter side 3: ");
        int side3 = sc.nextInt();

       // int side1 = 5; // Replace with the lengths of your triangle's sides
       // int side2 = 4;
       // int side3 = 4;

        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral triangle");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("Scalene triangle");
        }


        //Using for loop get the input  from User
        //Scanner sc = new Scanner(System.in);
        //
        //        int[] sides = new int[3];  // Array to hold the 3 sides
        //
        //        // Use a loop to take 3 inputs
        //        for (int i = 0; i < 3; i++) {
        //            System.out.print("Enter side " + (i + 1) + ": ");
        //            sides[i] = sc.nextInt();
        //        }
        //        int side1 = sides[0];
        //        int side2 = sides[1];
        //        int side3 = sides[2];
    }
}
