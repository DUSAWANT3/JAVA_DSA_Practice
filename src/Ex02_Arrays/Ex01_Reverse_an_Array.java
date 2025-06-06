package Ex02_Arrays;

import java.util.Arrays;
import java.util.Collections;

public class Ex01_Reverse_an_Array {
    public static <List> void main(String[] args) {

//1. Reverse Using a while Loop (In-Place Swap)
        int[] arr = {1, 2, 3, 4, 5};

        int start = 0;
        int end = arr.length - 1;
        while (start < end) { //less than operator (<)
            // Swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        // Print reversed array
        for (int num : arr) {
            System.out.print(num + " ");
        }

 //2. Reverse Using a New Array (Not In-Place)
        int[] original = {1, 2, 3, 4, 5};
        int[] reversed = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }
        for (int num : reversed) {
            System.out.print(num + " ");
        }

//3. Reverse Using Collections (For Object Arrays like Integer[])
        Integer[] arr1 = {100, 200, 300, 400};
        // Reverse using Collections
        Collections.reverse(Arrays.asList(arr1));
        System.out.println(Arrays.toString(arr1)); //[5, 4, 3, 2, 1]


        //1. Reverse Using a while Loop (In-Place Swap)
        int[] ar1 = {1, 2, 3, 4, 5}; // Initialize the array to be reversed

        int start1 = 0; // Start index (beginning of the array)
        int end1 = arr.length - 1; // End index (last element of the array)
        while (start1 < end1) { // Continue until start meets or crosses end
            // Swap the elements at start and end positions
            int temp1 = arr[start1]; // Store the value at start index in a temporary variable
            arr[start1] = arr[end1]; // Assign the value at end index to start index
            arr[end1] = temp1; // Assign the stored value to end index

            start1++; // Move start index forward
            end1--;   // Move end index backward
        }
// Print the reversed array
        for (int num : arr1) {
            System.out.print(num + " "); // Output each element of the reversed array
        }
    }
}
