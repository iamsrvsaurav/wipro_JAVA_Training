package basiccollection0;

import java.util.ArrayList;
import java.util.List;

public class Prg1 {

	public static void main(String[] args) {
		//ArrayList list = new ArrayList();
		
		List list = new ArrayList();
		
		list.add(1);
		list.add("one");
		list.add(1);
		list.add(2);
		
		System.out.println(list.contains("one"));
		
		for(Object o : list) {
			System.out.println(o);
		}
		

	}

}
