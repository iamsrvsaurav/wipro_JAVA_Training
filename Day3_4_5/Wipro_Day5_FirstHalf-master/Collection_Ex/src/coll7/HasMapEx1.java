package coll7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HasMapEx1 {

	public static void main(String[] args) {
		Map map = new HashMap();
		//Adding element
		map.put("name","Rakesh");
		map.put("age", 50);
		map.put("city","Delhi");
		map.put(1,"Akash");
		Set set = map.entrySet();//converting to set so that we can traverse
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			//Convert to map entry so we can get key and value
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey()+","+entry.getValue());
		}
		
		

	}

}
