package coll1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEx3 {

	public static void main(String[] args) {
		//Generic collection
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(10);
		list.add(30);
		list.add(15);
		Collections.sort(list);
		System.out.println(list);
		List<String> list1 = new ArrayList<>();
		list1.add("Rakesh");
		list1.add("Ajay");
		list1.add("Vijay");
		list1.add("Sanjay");
		Collections.sort(list1);
		System.out.println(list1);

	}

}
