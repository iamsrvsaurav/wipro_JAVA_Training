package ex;
/*
 * 1. ConcurrentHashMap
A thread-safe and high-performance alternative to HashMap.

 */

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Thread-safe put
        map.put("Java", 1);
        map.put("Python", 2);

        // Thread-safe get
        System.out.println("Java value: " + map.get("Java"));

        // putIfAbsent
        map.putIfAbsent("Java", 10);  // Will not update because "Java" already exists

        
        for(Map.Entry<String, Integer> m : map.entrySet()) {
        	System.out.println(m.getKey()+","+m.getValue());
        }
    }
}
