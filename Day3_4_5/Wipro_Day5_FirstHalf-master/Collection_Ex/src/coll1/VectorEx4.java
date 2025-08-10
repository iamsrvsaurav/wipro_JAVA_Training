package coll1;

import java.util.List;
import java.util.Vector;

public class VectorEx4 {

	public static void main(String[] args) {
		List v = new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		for(Object o : v)
		{
			System.out.println(o);
		}

	}

}
