package Ex07_StringLetters_manipulation_fundamentals;

import java.sql.SQLOutput;

public class EX99 {
    public static void main(String[] args) {
        String input = "Durgesh Sawant";
        String output = "";

        for(int i=0; i< input.length(); i++){
            char ch = input.charAt(i);
            if(Character.isUpperCase(ch)){
                output+= Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                output += Character.toUpperCase(ch);
            }else {
                output += ch;
            }
        }

        System.out.println(output);
    }
}
