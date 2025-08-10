package coll7;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx2 {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("Age",50);
		map.put("Exp", 20);
		//Element can be traverse in any order
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+","+m.getValue());
		}
		

	}

}
