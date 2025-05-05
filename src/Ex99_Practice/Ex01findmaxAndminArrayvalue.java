package Ex99_Practice;

import java.util.Arrays;

public class Ex01findmaxAndminArrayvalue {
    public static void main(String[] args) {

        int[] arr = {3, 65, 87, 54, 99, 2, 45};
//find max and min using jav 8 Stream
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println("Max value = " + max); //99
        System.out.println("Min Value = " + min); //2

        //use for if loop

        int max1 = arr[0];
        int min1 = arr[0]; //assume

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max1 = arr[i];
            }
            if (arr[i] < min1) {
                min1 = arr[i];
            }
        }
        System.out.println("Max value = " + max1);
        System.out.println("Min Value = " + min1); //2

        //reverse an array using java 8 Stream()
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};


    }
}

