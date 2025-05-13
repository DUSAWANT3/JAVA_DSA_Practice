package Ex02_Arrays;

public class Ex04_Find_Missing_Number_In_An_Array {
    public static void main(String[] args) {
        //Ex04_Find_Missing_Number_In_An_Array
        //natural numbers = n*(n+1)/2
         int n = 6; //length of int
        int[] arr ={1, 2, 4, 5, 6};

        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;

        for (int i=0 ; i<arr.length; i++ ) {
           arraySum = arraySum+ arr[i];
        }
        int missingNumber = totalSum - arraySum;
        System.out.println("Missing number is: " + missingNumber);
        //Missing number is: 3
    }
}
