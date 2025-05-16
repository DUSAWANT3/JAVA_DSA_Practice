package Ex03_Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ex07_Check_if_two_strings_are_anagrams {
    public static void main(String[] args) {
        //✅ Ex07_Check if two strings are anagrams
        //Two strings are anagrams if:
        //They contain the same characters,
        //With the same frequency,
        //But possibly in a different order.
        //"listen", "silent" /"hello", "holle"

        String s1 = "listen"; //Tea & Eat
        String s2 = "silent";

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.length() == s2.length()) {
            char[] Array1 = s1.toCharArray();
            char[] Array2 = s2.toCharArray();

            Arrays.sort(Array1);
            Arrays.sort(Array2);
            boolean result = Arrays.equals(Array1, Array2);
            if (result) {
                System.out.println("Is  anagram");
            } else {
                System.out.println("Is not anagram");
            }
        } else {
            System.out.println("Is not anagram");
        }

    }
}
