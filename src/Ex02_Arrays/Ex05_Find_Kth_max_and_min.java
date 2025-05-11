package Ex02_Arrays;

import java.util.Arrays;

public class Ex05_Find_Kth_max_and_min {
    public static void main(String[] args) {
        //Find the "Kth" max and min element of an array
        // k = 3 we need to find 3rd min & max element

        int[] arr ={7, 10, 4, 3, 20, 15};
         int  k = 3;
        Arrays.sort(arr);// Sorts the array in ascending order
        int kthMin = arr[k - 1];                  // kth smallest
        int kthMax = arr[arr.length - k];         // kth largest
        System.out.println(k + "rd Min = " + kthMin);//3rd Min = 7
        System.out.println(k + "rd Max = " + kthMax);//3rd Max = 10
    }
}
