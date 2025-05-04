package Ex02_Arrays;

public class Ex00_Arrays {

    //An array in Java is a data structure that stores a fixed-size sequence of elements of the same data type.

    //Key Features:
    //Arrays are zero-indexed: the first element is at index 0. Contiguous Memory Allocation (for Primitives)
    //Size is fixed upon creation and cannot be changed.
    //Can store primitive types (like int, char, double) or objects (like String, Integer, etc.).
    // Getting the length of the array --> int length = numbers.length;


    //Syntax
    public static void main(String[] args) {

        // Declare and initialize an array of integers
        int[] numbers = new int[5]; // creates an array of size 5

        // Assigning values
        numbers[0] = 10;
        numbers[1] = 20;

        // Declaring and initializing in one line
        String[] fruits = {"Apple", "Banana", "Cherry"};

// Accessing elements
        System.out.println(fruits[1]); // Output: Banana

        // traversing array
        for (int i = 0; i < fruits.length; i++)
            System.out.print(fruits[i] + " ");
    }
}
