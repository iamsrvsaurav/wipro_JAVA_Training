package com.wipro.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		String str1 = o1.getEmpName();
		String str2 = o2.getEmpName();
		return str1.compareTo(str2);
	}

}
