package Ex06_Java_8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex02_java_8 {
    public static void main(String[] args) {
//✔️2. Filter even numbers from a list using Streams.
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> even = num.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        even.forEach(n -> System.out.print(n + ", "));
        even.forEach(System.out::println);

  //✔️ 3. Find the maximum value in a list using Streams.
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
        int max = numbers.stream()
                .max(Integer::compare)
                .orElse(0);
        System.out.println(max); // Output: 40

 //✔️4. Convert a list of strings to uppercase.
        List<String> names = Arrays.asList("alice", "bob");
        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperNames); // Output: [ALICE, BOB]



    }
}
