package Ex99_Practice;

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
    }
}
