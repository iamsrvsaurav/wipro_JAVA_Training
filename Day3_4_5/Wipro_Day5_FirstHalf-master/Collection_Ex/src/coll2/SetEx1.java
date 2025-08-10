package coll2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("One");
		set.add("Second");
		set.add("3rd");
		set.add(4);
		set.add(5.0F);
		set.add("Second");
		set.add(4);
		/*for(Object o:set) {
			System.out.println(o);
		}*/
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Object element = itr.next();
			System.out.println(element);
		}

	}

}
