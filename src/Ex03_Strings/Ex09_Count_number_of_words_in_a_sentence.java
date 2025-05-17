package Ex03_Strings;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex09_Count_number_of_words_in_a_sentence {
    public static void main(String[] args) {
        //✅ Ex09_Count number of words in a sentence
//✅Basic
        String str = "I am QA Tester";
        String[] count = str.split(" ");
        System.out.println(count.length);//4

//✅Use Regex \\s+ and trim()
        str = str.trim(); // Remove leading/trailing spaces
        if (str.isEmpty()) {
            System.out.println(0);
        } else {
            String[] words = str.split("\\s+"); // Split on 1+ whitespace
            System.out.println(words.length);//4
        }
//✅Use StringTokenizer
        StringTokenizer st = new StringTokenizer(str);
        System.out.println(st.countTokens()); //4
    }
}
