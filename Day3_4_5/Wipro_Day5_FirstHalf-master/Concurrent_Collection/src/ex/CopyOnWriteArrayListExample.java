package ex;
/*
 * 2. CopyOnWriteArrayList
A thread-safe variant of ArrayList where all mutative operations (add, set, remove, etc.)
 are implemented by making a fresh copy of the array.
 */

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        list.add("Java");
        list.add("Python");

        // Iteration is safe even during modification
        for (String lang : list) {
            System.out.println(lang);
            list.add("C++"); // This won't cause ConcurrentModificationException
        }

        System.out.println("Final list: " + list);
    }
}


