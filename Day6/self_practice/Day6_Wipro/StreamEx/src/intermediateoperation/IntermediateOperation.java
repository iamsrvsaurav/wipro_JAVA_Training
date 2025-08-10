package intermediateoperation;

import java.util.Arrays;
import java.util.List;

public class IntermediateOperation {

	public static void main(String[] args) {
		 List<String> names = Arrays.asList("Rakesh", "Anu", "Anu", "John", "Zara", "Arun");
		 
		 // 1. filter()
	      /*  names.stream()
	             .filter(name -> name.startsWith("A"))
	             .forEach(System.out::println);*/
		 
		// 2. map()
	        /*names.stream()
	             .map(String::toUpperCase)
	             .forEach(System.out::println);*/
		 
		 // 3. flatMap()
	        /*List<List<String>> nested = 
	        		Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("c", "d"));
	        nested.stream()
	              .flatMap(List::stream)
	              .forEach(System.out::print);  // Output: abcd*/
		 

	        // 4. distinct()
	        /*names.stream()
	             .distinct()
	             .forEach(System.out::println);*/
		 
		 	// 5. sorted()
	        /*names.stream()
	             .sorted()
	             .forEach(System.out::println);*/
		 
		// 6. peek() - For debugging
	       /* names.stream()
	             .peek(System.out::println)
	             .map(String::length)
	             .forEach(System.out::println);*/
		 
		 // 7. limit()
	       /* names.stream()
	             .limit(3)
	             .forEach(System.out::println);*/
		 
		// 8. skip()
	        names.stream()
	             .skip(2)
	             .forEach(System.out::println);










	}

}
