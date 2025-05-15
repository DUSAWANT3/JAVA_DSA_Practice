package Ex03_Strings;

public class Ex03_Print_characters_of_string_one_by_one {
    public static void main(String[] args) {
        //Print characters of a string one by one

        String str = "Hello World";

        for(int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i) + " ");
        }

  //Using Enhanced for-each loop with toCharArray()
        // Convert to char array
        for (char c : str.toCharArray()) {
            System.out.println(c);
        }

  //Java 8 Approach – Using chars() + forEach
        str.chars() // IntStream of Unicode values
                .forEach(ch -> System.out.println((char) ch));
    }
}
