package streamex1;

import java.util.Arrays;
import java.util.List;

public class Prg2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60);

        numbers.parallelStream() // Parallel Stream
               .map(n -> {
                   System.out.println("Processing: " + n + " in " + Thread.currentThread().getName());
                   return n * 2;
               })
               .forEach(System.out::println);
    }
}


