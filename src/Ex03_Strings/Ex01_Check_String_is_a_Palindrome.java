package Ex03_Strings;

public class Ex01_Check_String_is_a_Palindrome {
    //Check if a String is a Palindrome
    // is a word, phrase, or number that reads the same backward as forward.
    //Examples:
    //✅ madam, racecar, 121, nitin
    //❌ hello, java, world
    public static void main(String[] args) {
        //Method 01 -Using Two-Pointer Technique
        String str = "madam";

        boolean isPalindrome = true;
        int start = 0;
        int end = str.length() - 1;

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

        //Method 2 using For loop
        String str1 = "Madam";
        String org = str1;
        String rev = "";
        int len = str1.length();

        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str1.charAt(i);  //Reverse the string
        }

        System.out.println("Reversed: " + rev);

        if (org.equalsIgnoreCase(rev)) {   //Compare both the string
            System.out.println("It's a palindrome!");
        } else {
            System.out.println("Not a palindrome.");
        }
    }
}

