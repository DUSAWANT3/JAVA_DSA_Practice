package Ex99_Practice;

import java.util.Arrays;

public class Ex08_1505 {
    public static void main(String[] args) {
        //Merge two array

        int[] arr1 = {1,3,5,7,8};
        int[] arr2 = {2,4,6,9,10,11};

        int[] result = new int[arr1.length + arr2.length];
        int i=0, j=0, k=0;
        while (i<arr1.length && j<arr2.length){
            if(arr1[i] <= arr2[j]){
                result[k++] = arr1[i++];
            }else {
                result[k++] = arr2[j++];
            }
        }
        while (i < arr1.length){
            result[k++] = arr1[i++];
        }
        while (j < arr2.length){
            result[k++] = arr2[j++];
        }
        System.out.println(Arrays.toString(result));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$4");
    // Ex12_Count_even_and_odd_num_in_Array {
      int EvenNo = 0; // n%2 ==0
      int OddNo = 0;

        for(int l = 0; l<arr2.length ; l++){
            if(arr2[l] %2 == 0){
                EvenNo++;
            }else {
                OddNo++;
            }
        }
        System.out.println("Even No count  = "+EvenNo);
        System.out.println("Odd No count  = "+OddNo);

    }
}
