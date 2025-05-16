package Ex03_Strings;

import java.util.stream.Collectors;

public class Ex04_Reverse_a_tring {
    public static void main(String[] args) {
        //✅ Reverse a string (with and without using built-in methods)

        String str = "Hello World";
//✅ 1. Reverse a String Without Using Built-in Methods
        for(int i= (str.length()-1); i >=0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();//new line

//✅ 2. Reverse a String Using Built-in Java Methods
       String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);

 //✅ Using Java 8 Streams (Functional Style)
        String reversed1 = new StringBuilder(str)
                .reverse()
                .chars()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println(reversed1);
    }
}
