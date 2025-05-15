package Ex03_Strings;

public class Ex06_Check_string_is_palindrome {
    public static void main(String[] args) {
   // ✅ Check if a string is a palindrome

        String str = "madam";
      int i=0, j=(str.length()-1);
      Boolean isPalindrome = true;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++; j--;
        }
        if (isPalindrome) {
            System.out.println("✅ String is a palindrome");
        } else {
            System.out.println("❌ String is not a palindrome");
        }

 // ✅  Java 8 Style (One-liner using StringBuilder)
        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equals(reversed)) {
            System.out.println("✅ String is a palindrome");
        } else {
            System.out.println("❌ String is not a palindrome");
        }
    }
}
