package com.wipro.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1023,"Rakesh",50));
		list.add(new Employee(1021,"Vijay",23));
		list.add(new Employee(1020,"Ajay",19));
		System.out.println("Before sorting"+list);
		System.out.println("Sorting on id:");
		Collections.sort(list,new IdComparator());
		System.out.println(list);
		System.out.println("Sorting on name");
		Collections.sort(list,new NameComparator());
		System.out.println(list);
		System.out.println("Sorting on age");
		Collections.sort(list,new AgeComparator());
		System.out.println(list);
		

	}

}
