package Ex07_StringLetters_manipulation_fundamentals;

public class Ex01_StringLetters_Basic {
    public static void main(String[] args) {

        String originalString = "Hello World";

        // Convert to uppercase
        String upperCaseString = originalString.toUpperCase();
        System.out.println("Uppercase: " + upperCaseString); // Output: HELLO WORLD

        // Convert to lowercase
        String lowerCaseString = originalString.toLowerCase();
        System.out.println("Lowercase: " + lowerCaseString); // Output: hello world
    }
}
