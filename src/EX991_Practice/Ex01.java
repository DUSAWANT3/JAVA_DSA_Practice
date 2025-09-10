package EX991_Practice;

public class Ex01 {
    String src = "//input[@name=\"userName\"]";

    long count = src.chars()                      // Convert to IntStream
            .filter(Character::isLetter)   // Keep only alphabetic characters
            .count();                      // Count them

        //System.out.println("Total alphabetic characters: " + count);
}



//