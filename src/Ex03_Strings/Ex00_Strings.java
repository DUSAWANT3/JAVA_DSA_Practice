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

        //✅Ternary Operator (if else replace)
        //condition ? value_if_true : value_if_false;
        int num = 5;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(result); //odd

        System.out.println("*************************************************");
//✅immutable Why are strings immutable in Java?
 //A String in Java is a sequence of characters. It's an immutable object of the String class, meaning it can't be changed once created.A String in Java is a sequence of characters.
// It's an immutable object of the String class, meaning it can't be changed once created.

     String str1 = "Durgesh";//Java places "Durgesh" in the String pool.
     String str2 = "Durgesh"; //Java sees that "Durgesh" already exists in the pool, so it reuses the reference
     String str3 = new String("Durgesh"); //This explicitly creates a new String object in the heap, even though the content is the same.

        System.out.println(str1==str2); //true because it's pointing to same object/reference String pool.
        System.out.println(str1.equals(str2));//true contain the same value

        System.out.println(str1 == str3);//false because it's pointing to different object
        System.out.println(str1.equals(str3));//true

        String s = "Java";
        s.concat(" Rocks!");
        System.out.println(s); // "Java" — original string unchanged

        String newStr = s.concat(" Rocks!");
        System.out.println(newStr); // "Java Rocks!" — new string created

        //Strings in Java are immutable to ensure security, thread safety, efficient memory usage via the String pool,
        // hashcode caching, and overall simplicity in application design.
    }
}
