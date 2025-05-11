package Ex02_Arrays;

import java.util.Arrays;
public class Ex07_Move_negetive_element_to_end {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, -5, 6, -7, 8};

        int n = arr.length;
        int j = 0; // pointer for positive side

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                // Swap positive number to the front
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println("Rearranged array: " + Arrays.toString(arr));
    } //Rearranged array: [1, 3, 6, 8, -5, -2, -7, -4]
}

