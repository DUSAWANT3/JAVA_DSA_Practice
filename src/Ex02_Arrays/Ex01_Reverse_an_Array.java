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
    }
}
