package streamex1;

import java.util.Arrays;
import java.util.List;

public class Prg1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rakesh", "John", "Anu", "Mary");

        names.stream() // Sequential Stream
             .filter(name -> name.startsWith("A"))
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}
