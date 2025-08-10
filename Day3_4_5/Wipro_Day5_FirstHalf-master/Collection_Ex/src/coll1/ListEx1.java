package coll1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEx1 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("c");
		list.add("o");
		list.add("k");
		list.add("b");
		list.add(2,"j");
		Collections.sort(list);
		//System.out.println(list);
		for(Object o : list) {
			System.out.println(o);
		}
		list.add(5);//Integer wrapper
		System.out.println(list);
		list.remove(3);
		list.remove("b");
		System.out.println(list);
		list.clear();
		System.out.println(list);

	}

}
