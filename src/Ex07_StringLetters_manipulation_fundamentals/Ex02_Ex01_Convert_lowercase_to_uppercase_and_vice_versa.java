package Ex07_StringLetters_manipulation_fundamentals;

import java.sql.SQLOutput;

public class Ex02_Ex01_Convert_lowercase_to_uppercase_and_vice_versa {
    public static void main(String[] args) {

        //Input: "HeLLo WoRLd"  -- > Output: "hEllO wOrlD"
        String input = "Hello World";

        StringBuilder result = new StringBuilder(); //StringBuilder is faster than concatenating with + in a loop (because strings are immutable in Java).

        char data[] = input.toCharArray();//This line converts the input string into a character array.

        for(char c : data){
            if(Character.isUpperCase(c)){
                result.append(Character.toLowerCase(c));
            }
            else if (Character.isLowerCase(c)){
                result.append(Character.toUpperCase(c));
            }
            else{
                result.append(c);//If the character is not a letter (e.g. a space, digit, punctuation)just keep it as is
            }
        }
        System.out.println("Input   -->  " + input);
        System.out.println("Result -- >  " + result);
    }
}
