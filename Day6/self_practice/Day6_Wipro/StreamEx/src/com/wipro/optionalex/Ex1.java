package com.wipro.optionalex;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,2,1);
		
		Optional<Integer> element = list.stream()
				.findFirst();
		
		if(element.isPresent())
		{
			System.out.println(element.get());
		}else {
			System.out.println("Element is empty");
		}
	}
}
