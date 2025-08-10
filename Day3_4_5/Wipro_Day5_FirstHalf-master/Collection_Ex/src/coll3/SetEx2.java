package coll3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx2 {

	public static void main(String[] args) {
		/*Set set = new HashSet();
		set.add("Java");
		set.add("Collection");
		set.add("Programming");
		set.add("Framework");
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			String str = (String)itr.next();
			System.out.println(str);
		}*/
		
		Set<String> set = new HashSet<>();
		set.add("Java");
		set.add("Collection");
		set.add("Programming");
		set.add("Framework");
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}

	}

}
