package Ex06_Java_8;

import java.util.Arrays;
import java.util.List;

public class Ex01_Java_8 {
    public static void main(String[] args) {
        //Lambda Expressions: Enable functional programming by writing functions inline.
        //● Stream API: Process collections in a functional style.
        //● Functional Interfaces: Interfaces with a single abstract method (e.g., Predicate,
        //Function).
        //● Optional: Avoid NullPointerException.
        //● Default Methods: Add default implementations in interfaces.
        //● Date and Time API: Improved handling of dates and times.
        //● Method References: Simplified syntax for calling methods.

        //A Stream represents a sequence of elements for processing.
        //● Intermediate Operations (return a Stream):
        //○ filter(): Filter elements based on a condition.
        //○ map(): Transform elements.
        //○ sorted(): Sort elements.
        //● Terminal Operations (consume the Stream):
        //○ collect(): Convert to a collection.
        //○ forEach(): Perform an action.
        //○ reduce(): Aggregate elements.

 //1. Print a list using Lambda Expressions.
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println(name));
        names.forEach(System.out::println);


    }
}
