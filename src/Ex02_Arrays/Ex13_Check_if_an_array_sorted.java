package Ex02_Arrays;

import java.util.Arrays;

public class Ex13_Check_if_an_array_sorted {
    public static void main(String[] args) {
        //Check if an array is sorted
        int[] arr = {1, 2, 3, 5, 5, 6};

        Boolean isSorted = true;

        for(int i=0; i<arr.length -1; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted == true){
            System.out.println("Given array is sorted");
        }else {
            System.out.println("Given array is not sorted");
        }
    }
}
