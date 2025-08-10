package com.wipro.comparable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

	public static void main(String[] args) {
		//Nongeneric
		//List employees = new ArrayList();
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee(1010,"Rajeev",100000.00,LocalDate.of(2010, 7, 10)));
		employees.add(new Employee(1004,"Chris",95000.00,LocalDate.of(2017, 3, 19)));
		employees.add(new Employee(1015,"David",1340000.95,LocalDate.of(2024, 7, 12)));
		
		System.out.println("Employees before sorting:"+employees);
		
		Collections.sort(employees);
		System.out.println("Employees after sorting:"+employees);

	}

}
