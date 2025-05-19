package Ex03_Strings;

import java.util.Arrays;

public class Ex12_Check_String_Valid_Shuffle_of_Two_Strings {
    public static void main(String[] args) {
        //Ex12_Check if a String is a Valid Shuffle of Two Strings
        //Given three strings: str1, str2, and result, check if result is a valid shuffle of str1 and str2.
        //A valid shuffle means:
        //result contains all characters from str1 and str2, and
        //the order of characters in str1 and str2 is preserved in result.

        //sort -
        //s1 + s2 = Result

        String s1 = "abc";
        String s2 = "def";
        String result = "adbecf";

        boolean isShuffle = true;
        if (s1.length() + s2.length() != result.length()) {
            isShuffle = false;
        } else {
            int i = 0, j = 0, k = 0;
            while (k < result.length()) {
                char c = result.charAt(k);
                if (i < s1.length() && s1.charAt(i) == c) {
                    i++;
                } else if (j < s2.length() && s2.charAt(j) == c) {
                    j++;
                } else {
                    isShuffle = false;
                    break;
                }
                k++;
            }
            // Final check to ensure all characters from s1 and s2 were used
            if (i != s1.length() || j != s2.length()) {
                isShuffle = false;
            }
        }
        System.out.println("Is valid shuffle: " + isShuffle);  // Expected: true
    }
}
