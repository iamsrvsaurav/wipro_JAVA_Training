package coll7;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx4 {

	public static void main(String[] args) {
		Map map = new TreeMap();
		map.put("name","Rakesh");
		map.put("age",50);
		map.put("city","Delhi");
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry m = (Map.Entry)itr.next();
			System.out.println(m.getKey()+","+m.getValue());
		}

	}

}
