package basiccollection0;

import java.util.HashSet;
import java.util.Set;

public class Prg2 {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add(1);
		set.add("one");
		set.add(1);
		set.add(2);
		
		for(Object o : set) {
			System.out.println(o);
		}

	}

}
