package Ex99_Practice;

import java.util.Arrays;

public class Ex12_2105 {
    public static void main(String[] args) {
        //Reverse an Array
        int[] arr = {1, 2, 3, 4, 5};

        int start = 0;
        int end = arr.length-1;

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
