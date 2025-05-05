package Ex03_Strings;

public class Ex00_Strings {// Java Program to demonstrate String

    //A String in Java is a sequence of characters.
    // It's an object of the String class and immutable, meaning once created, it can't be changed.

    // Main Function
    public static void main(String args[]) {

        // creating Java string using a new keyword
        String str = new String("Hello");
        System.out.println(str); //Hello

        System.out.println(str.length()); //5
        System.out.println(str.toLowerCase());//hello
        System.out.println(str.toUpperCase());//HELLO

        System.out.println(str.indexOf("o")); // 4
        System.out.println(str.contains("l")); //True
        System.out.println(str.charAt(4)); //o
        System.out.println(str.replace("l","k")); //Hekko
    }
}
