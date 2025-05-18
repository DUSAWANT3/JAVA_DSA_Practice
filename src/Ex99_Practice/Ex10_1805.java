package Ex99_Practice;

import java.util.Arrays;

public class Ex10_1805 {
    public static void main(String[] args) {
        //remove whitespaces

        String str = " Hi I am QA tester ";

        str = str.replace(" ", "");
        System.out.println(str);

        String str1 = " Hi I am QA tester ";

        str1 = str1.trim().replaceAll("\\s+", "");
        System.out.println(str1);

        //count no of words in String
        String str2 = " Hi I am QA tester ";
          str2 = str2.trim();
        String[] count = str2.split("\\s+");
        System.out.println(count.length);

        //find all substring of strings -
        //n(n+1)/2  =

        String str3 = "abc";

        for(int i=0; i<str3.length(); i++){
            for(int j=i+1; j<=str3.length(); j++){
                System.out.println(str3.substring(i, j));
            }

        }

    }
}

