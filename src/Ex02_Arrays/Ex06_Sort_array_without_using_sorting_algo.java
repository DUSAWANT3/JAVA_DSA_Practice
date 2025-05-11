package Ex02_Arrays;

import java.util.Arrays;

public class Ex06_Sort_array_without_using_sorting_algo {
    public static void main(String[] args) {
        //Given an array that consists of only 0, 1 and 2.
        // Sort the array without using any sorting algorithm
        //Input: arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
        //Output: {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}

        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int n = arr.length;

        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else { // arr[mid] == 2
                swap(arr, mid, high);
                high--;
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
