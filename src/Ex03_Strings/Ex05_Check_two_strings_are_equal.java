package Ex03_Strings;

public class Ex05_Check_two_strings_are_equal {
    public static void main(String[] args) {
 //✅ Check if two strings are equal (case-sensitive and insensitive)
        //Case-sensitive (e.g., "Hello" vs "hello" → not equal)
       //Case-insensitive (e.g., "Hello" vs "hello" → equal)

        String str1 = "Hello";
        String str2 = "Hello";
        boolean isEqual = true;
 //✅ Case-Sensitive
        if (str1.length() != str2.length()) {// First check lengths
            isEqual = false;
        } else { //Compare each character
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    isEqual = false;
                    break;
                }
            }
        }
        if (isEqual) {
            System.out.println("Strings are equal (case-sensitive)");
        } else {
            System.out.println("Strings are not equal");
        }

 //✅ Case-Insensitive Comparison
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Strings are equal (case-insensitive)");
        } else {
            System.out.println("Strings are not equal");
        }

 //✅ Using Java 8
        boolean isEqual1 = str1.equals(str2); // case-sensitive
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2); // case-insensitive
    }
}

