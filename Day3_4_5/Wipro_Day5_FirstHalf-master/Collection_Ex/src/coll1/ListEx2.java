package coll1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEx2 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(12);
		list.add(10);
		list.add(30);
		list.add(15);
		//list.add("D");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
