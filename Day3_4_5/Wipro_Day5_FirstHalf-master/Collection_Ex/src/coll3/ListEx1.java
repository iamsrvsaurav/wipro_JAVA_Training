package coll3;


import java.util.ArrayList;
import java.util.List;

public class ListEx1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(15);
		list.add(34);
		list.add(45);
		list.add(56);
		
		for(Integer i : list) {
			System.out.println(i);
		}

	}

}
