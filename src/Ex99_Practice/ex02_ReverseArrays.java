package Ex99_Practice;

import java.util.Arrays;

public class ex02_ReverseArrays {
    public static void main(String[] args) {
        //Reverse an array

        int[] arr = {1, 2, 3, 4, 5, 6};
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
           //swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        for (int i =0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

  //find max element in an array
        int[] arr1 = {25, 78, 12, 89, 34, 99, 1};
        int max = arr1[0];  //assume max no

        for (int i =0 ; i < arr1.length;i++){
            if(arr1[i] > max){
                max = arr1[i];
            }
        }
        System.out.println("Max no is = "+ max);


       int max1 = Arrays.stream(arr1).max().getAsInt();
        System.out.println("Max no is = "+ max1);



    }
}

