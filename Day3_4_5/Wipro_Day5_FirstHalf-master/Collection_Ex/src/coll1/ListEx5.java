package coll1;

import java.util.ArrayList;
import java.util.List;

public class ListEx5 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(11);
		list.add(0);
		list.add(23);
		list.add(11);
		System.out.println(list);
		Object o  = list.remove(0);
		System.out.println(o);
	}

}
