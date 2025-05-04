package Ex02_Arrays;

import java.util.Arrays;

public class Ex02_Find_Maximum_Element_in_Array {
    public static void main(String[] args) {
        //Assume the first element is the max.
        //Loop through the array.
        //Compare each element with the current max.
        //Update the max if a larger value is found.
        int[] arr = {25, 78, 12, 89, 34, 99, 1};

        int max = arr[0]; // assume first element is max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // update max if current is greater
            }
        }
        System.out.println("Maximum element in the array is: " + max);

  //Alternate using Java 8 Streams (for int[])
        int[] arr1 = {25, 78, 12, 89, 34, 99, 1};
        int max1 = Arrays.stream(arr1).max().getAsInt();
        System.out.println("Maximum element using streams: " + max);

    }
}
