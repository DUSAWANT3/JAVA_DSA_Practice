package Ex03_Strings;

public class Ex08_Remove_whitespaces_from_string {
    public static void main(String[] args) {
        //✅ Remove all whitespaces from a string
         //Gole -Given a string, remove all whitespace characters, including spaces, tabs, and newlines.
        String str = "  Hello   World\t\n";

//Using String.replaceAll() regex
        String Result = str.replaceAll("\\s+", "");
        System.out.println(Result);

       //\\s+ is a regular expression (regex) that matches one or more whitespace characters:
        //\s → whitespace (space, tab, newline, etc.)
        //+ → one or more occurrences

 //Using StringBuilder (Manual Approach)
        StringBuilder result1 = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                result1.append(c);
            }
        }
        System.out.println("Output: " + result1.toString());
    }
}
