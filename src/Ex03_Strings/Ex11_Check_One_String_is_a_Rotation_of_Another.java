package Ex03_Strings;

public class Ex11_Check_One_String_is_a_Rotation_of_Another {
    public static void main(String[] args) {
        //Ex11_Check if One String is a Rotation of Another
        //Input: s1 = "waterbottle", s2 = "erbottlewat"  (True)
        //If s2 is a rotation of s1, then s2 must be a substring of s1 + s1.

        String s1 = "waterbottle";
        String s2 = "erbottlewat";

        boolean isRotation = true;

        if (s1.length() != s2.length()) {
            isRotation = false;
        } else {
            String concatenated = s1 + s1;
            isRotation = concatenated.contains(s2);
        }
        System.out.println(isRotation);  // Output: true

    }
}
