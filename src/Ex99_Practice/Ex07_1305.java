package Ex99_Practice;

import java.util.Arrays;

public class Ex07_1305 {
    public static void main(String[] args) {
        //find missing no in array
        int[] arr = {4, 5,7,3,2,1}; //missing 6
        int n = 7;
        int totalCount = n*(n+1)/2;
        int arrayCount =0;
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
             arrayCount = arrayCount + arr[i];
        }
        int missingEle = totalCount - arrayCount;
        System.out.println("Missing Element = " + missingEle);

        System.out.println("#######################################");

        //find Kth max and min
        int[] arr1 = {4, 5,7,3,2,1,9, 10, 24};
        int k =3;

        Arrays.sort(arr1);
        int Kmin = arr1[k-1];
        int Kmax = arr1[arr1.length - k];
        for(int num : arr1){
            System.out.print(" " + num);
        }
        System.out.println();
        System.out.println("kmin "+ Kmin);
        System.out.println("Kmax " + Kmax);
        System.out.println("#######################################");

        //move zero to end
        int[] arr2 = {4, 5,7,3,2,0,9, 0, 24,0};
        int n1 = arr2.length;
        int j = 0; // pointer for positive side

        for (int i = 0; i < n1; i++) {
            if (arr2[i] == 0) {
                // Swap positive number to the front
                int temp = arr2[i];
                arr2[i] = arr2[j];
                arr2[j] = temp;
                j++;
            }
        }
        System.out.println("Rearranged array: " + Arrays.toString(arr2));

         for(int i = arr2.length-1; i >= 0;i--){
             System.out.print(" "+ arr2[i]);
         }
    }
}

