package Ex02_Arrays;

import java.util.Arrays;

public class Ex03_Find_Minimum_Element_in_Array {
    public static void main(String[] args) {
        int[] arr = {25, 78, 12, 89, 34, 99, 2};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum_Element_in_Array = " + min);
//Using Java 8 Stream
        int min1 = Arrays.stream(arr).min().getAsInt();
        System.out.println("Minimum_Element_in_Array = " + min1);
    }
}
