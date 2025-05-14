package Ex02_Arrays;

import java.util.Arrays;

public class Ex14_Merge_two_sorted_arrays {
    public static void main(String[] args) {
        //Given two sorted arrays arr1 and arr2, merge them into a single
        // sorted array in non-decreasing order.
        //This problem is classic for using the two-pointer technique — similar to the merge step in Merge Sort.
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 10};
        int[] res = new int[arr1.length + arr2.length];

        int i=0, j=0, k=0;

        while (i < arr1.length && j<arr2.length){
            if(arr1[i] <= arr2[j]){
                res[k++] = arr1[i++];
            }else{
                res[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {// Add remaining elements from arr1
            res[k++] = arr1[i++];
        }
        while (j < arr2.length) {// Add remaining elements from arr2
            res[k++] = arr2[j++];
        }
        System.out.println(Arrays.toString(res));
        //[1, 2, 3, 4, 5, 6, 7, 8, 10]
    }

}
