package Ex03_Strings;

public class Ex10_Find_all_substrings_of_a_string {
    public static void main(String[] args) {
        //✅ Find all substrings of a string
       //A substring is a contiguous sequence of characters from a string.
        //All substrings are: a, ab, abc, b, bc, c
        //non empty substring = n(n+1)/2 if for empty add +1
        String str = "abc";

        System.out.println("All substrings of " + str + ":");

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
                //a ab abc b bc c
            }
        }
    }
}
