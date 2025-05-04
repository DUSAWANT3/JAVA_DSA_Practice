package Ex03_Strings;

public class Ex01_Check_String_is_a_Palindrome {
    //Check if a String is a Palindrome
    //A palindrome is a word, phrase, or number that reads the same backward as forward.
    //Examples:
    //✅ madam, racecar, 121
    //❌ hello, java, world
    public static void main(String[] args) {
        //Method 01 -Using Two-Pointer Technique
        String str = "madam";

        boolean isPalindrome = true;
        int start = 0, end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }

    }
}
