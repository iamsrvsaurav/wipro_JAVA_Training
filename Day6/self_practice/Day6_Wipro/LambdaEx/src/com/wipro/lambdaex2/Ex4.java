package com.wipro.lambdaex2;

import java.util.ArrayList;
import java.util.List;

public class Ex4 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Ajay");
		list.add("Muskan");
		list.add("Rakshit");
		list.add("Zaumai");
		list.add("Utkarsh");
		
		list.forEach((n)->System.out.println(n));

	}

}
