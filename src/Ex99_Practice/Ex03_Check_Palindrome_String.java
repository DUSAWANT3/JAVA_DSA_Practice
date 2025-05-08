package Ex99_Practice;

import java.util.Scanner;

public class Ex03_Check_Palindrome_String {
    //Palindrome
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string = ");

        String str = sc.nextLine();

       // String str = "Madam";

        int start = 0;
        int End = str.length() - 1;
        boolean Palindrome = true;

        while (start < End) {
            if (str.charAt(start) != str.charAt(End)) {
                Palindrome = false;
                break;
            }
            start++;
            End--;
        }
        if(Palindrome){
            System.out.println(str + " Palindrome string");
        }else
            System.out.println(str + " not Palindrome string");
    }
}