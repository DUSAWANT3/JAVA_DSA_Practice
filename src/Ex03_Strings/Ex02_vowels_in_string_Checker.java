package Ex03_Strings;

public class Ex02_vowels_in_string_Checker {
    public static void main(String[] args) {

        String input1 = "Hello World";
        int count1 = 0;
        input1 = input1.toLowerCase();
        for(int i= 0; i < input1.length(); i++){
            if (input1.charAt(i) == 'a' || input1.charAt(i) == 'e' || input1.charAt(i) == 'i' ||
                    input1.charAt(i) == 'o' || input1.charAt(i) == 'u'){
              count1++;
            }
        }
        System.out.println("Number of vowels: " + count1);

//Method 2 Java 8 Stream
        String input = "Hello World";
        long count = input.toLowerCase()
                .chars()
                .filter(ch -> "aeiou".indexOf(ch) != -1)
                .count();

        System.out.println("Number of vowels: " + count);

//Method 3
        String input2 = "Hello World";
        int count2 =0;
         for(char c : input2.toCharArray()){ //input2.toCharArray() converts the string into a char array:
             if("aeiouAEIOU".indexOf(c) != -1){
                 count2++;
             }
         }
        System.out.println("Number of vowels: " + count2);
    }
}