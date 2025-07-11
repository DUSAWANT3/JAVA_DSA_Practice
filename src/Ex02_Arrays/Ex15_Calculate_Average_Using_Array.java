package Ex02_Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Ex15_Calculate_Average_Using_Array {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for(int i =0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        double avg = (double) sum/arr.length;

        System.out.println("Sum: "+ sum); //150
        System.out.println("Average: "+ avg); //30.0

 //Method 2 - using Java 8

        double Average = Arrays.stream(arr)
                .average()
                .getAsDouble();
        System.out.println("Average: " + Average);//30.0

    }
}
