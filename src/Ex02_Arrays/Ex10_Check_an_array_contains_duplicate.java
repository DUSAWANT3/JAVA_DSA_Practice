package Ex02_Arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class Ex10_Check_an_array_contains_duplicate {
    //Ex10_Check if an array contains a duplicate element

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 7, 9, 3}; // Duplicate: 3
        Boolean duplicate = false;
        for(int i =0; i<arr.length; i++){
            for(int j =i+1; j<arr.length; j++ ){
                if(arr[i]==arr[j]){
                    duplicate = true;
                }
            }
        }
        if(duplicate==true){
            System.out.println("Array is Duplicate Elements");
        }else {
            System.out.println("Array is not Duplicate Elements");
        }

  //Using Java 8
        Set<Integer> seen = new HashSet<>();

        boolean hasDuplicate = IntStream.of(arr)
                .anyMatch(num -> !seen.add(num)); // add() returns false if duplicate

        if (hasDuplicate) {
            System.out.println("Array contains duplicate elements.");
        } else {
            System.out.println("Array does NOT contain duplicate elements.");
        }
    }
}
