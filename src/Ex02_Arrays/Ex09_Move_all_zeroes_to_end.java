package Ex02_Arrays;

import java.util.Arrays;

public class Ex09_Move_all_zeroes_to_end {
    public static void main(String[] args) {
        //Move all zeroes to the end of the array,
        // while maintaining the order of non-zero elements.
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
       int count = 0;  // Count of non-zero elements

        for(int i =0; i <arr.length; i++){
            if(arr[i] != 0){
                arr[count] = arr[i];
                count++;
            }
        }
        while (count < arr.length ){
            arr[count++]= 0;
        }
        System.out.println(Arrays.toString(arr));
        //[1, 2, 4, 3, 5, 0, 0, 0]
    }
}
