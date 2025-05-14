package Ex02_Arrays;

public class Ex12_Count_even_and_odd_num_in_Array {
    public static void main(String[] args) {
        //Ex12_Count the number of even and odd numbers in an array java
        //Even number: Divisible by 2 (num % 2 == 0)
        //Odd number: Not divisible by 2 (num % 2 != 0)
        int[] arr = {2, 5, 8, 9, 12, 15, 18};

        int evenNo = 0;
        int oddNo = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenNo++;
            }else {
                oddNo++;
            }
        }
        System.out.println("Even numbers count: " + evenNo);
        System.out.println("Odd numbers count: " + oddNo);
    }
}
