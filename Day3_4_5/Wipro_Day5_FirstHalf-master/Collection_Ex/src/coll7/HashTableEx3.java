package coll7;

import java.util.Hashtable;
import java.util.Map;

public class HashTableEx3 {

	public static void main(String[] args) {
		Map<String,String> map = new Hashtable<>();
		map.put("name","Rakesh");
		map.put("age","50");
		map.put("city","Delhi");
		/*Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry m = (Map.Entry)itr.next();
			System.out.println(m.getKey()+","+m.getValue());
		}*/
		
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+","+m.getValue());
			
		}

	}

}
