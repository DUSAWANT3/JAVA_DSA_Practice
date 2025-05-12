package Ex02_Arrays;

import java.util.Arrays;

public class Ex08_Find_frequency_count {
    public static void main(String[] args) {
        //Find the frequency/count of each component of the array
        int[] arr = {2, 3, 2, 5, 8, 3, 3, 2, 5};
        int[] frequency = new int[arr.length];
        int visited = -1;

        for (int i = 0; i < arr.length; i++) {
            if (frequency[i] == visited) {
                continue; // already counted
            }
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    frequency[j] = visited; // mark as counted
                }
            }
            frequency[i] = count; // store frequency
        }
        System.out.println("Element | Frequency");
        System.out.println("-------------------");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != visited) {
                System.out.println("   " + arr[i] + "    |    " + frequency[i]);
            }
        }
    }
}
