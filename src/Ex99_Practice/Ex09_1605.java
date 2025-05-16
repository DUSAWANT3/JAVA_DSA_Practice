package Ex99_Practice;

import java.util.Arrays;
import java.util.Locale;

public class Ex09_1605 {
    public static void main(String[] args) {
        //Ex04 reverse a string

        String str1 = "QATESTING" ;

        for(int i=str1.length()-1; i>=0; i--){
            System.out.print(str1.charAt(i) + " ");
        }
        System.out.println();
       // Check  2 string are equal
        String str2 = "QATESTING" ;
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Strings are equal (case-insensitive)");
        } else {
            System.out.println("Strings are not equal");
        }

        System.out.println("44444444444444444444444444444444");

   //Tea & Eat
        String s1= "Tea";
        String s2 = "Eat";
        //lower case
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        //length
        if(s1.length() == s2.length()){
            char[] Array1 = s1.toCharArray();
            char[]  Array2 = s2.toCharArray();

            Arrays.sort(Array1);
            Arrays.sort(Array2);
             boolean isEqual = Arrays.equals(Array1,Array2);
            if(isEqual){
                System.out.println("is Equal");
            }else{
                System.out.println("is not Equal");
            }
        }else {
            System.out.println("is not Equal");
        }



    }
}
