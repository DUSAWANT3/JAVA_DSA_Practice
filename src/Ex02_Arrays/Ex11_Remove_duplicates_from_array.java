package Ex02_Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex11_Remove_duplicates_from_array {
    //Remove duplicates from a sorted/unsorted array
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};//sorted array

        int[] temp = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[arr.length - 1]; // add last element
        // Print result
        System.out.print("After removing duplicates: ");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " "); // 1 2 3 4 5
        }
        System.out.println();
        System.out.println(Arrays.toString(temp));
        //[1, 2, 3, 4, 5, 0, 0, 0]

 //using java 8
        int[] unique = IntStream.of(arr)
                .distinct() // removes duplicates
                .toArray();
        System.out.println("After removing duplicates: " + Arrays.toString(unique));
    }
}
