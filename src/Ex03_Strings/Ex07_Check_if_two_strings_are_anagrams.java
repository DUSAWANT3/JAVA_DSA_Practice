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
//Using HashMap
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println("✅ Strings are anagrams");
        } else {
            System.out.println("❌ Strings are not anagrams");
        }
    }
    public static boolean areAnagrams(String s1, String s2) {
  // Step 1: Length check
        if (s1.length() != s2.length()) {
            return false;
        }
 // Step 2: Frequency map
        Map<Character, Integer> freqMap = new HashMap<>();
        // Count frequency in s1
        for (char c : s1.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
  // Subtract frequency using s2
        for (char c : s2.toCharArray()) {
            if (!freqMap.containsKey(c)) return false;

            freqMap.put(c, freqMap.get(c) - 1);
            if (freqMap.get(c) < 0) return false;
        }
        return true; // All frequencies matched
    }
    //----------------------------------------------------------
    public static boolean isAnagramBySorting(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
