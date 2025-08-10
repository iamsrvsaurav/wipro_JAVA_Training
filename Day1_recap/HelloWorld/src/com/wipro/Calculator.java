package com.wipro;


public class Calculator {
	
	public void add(int x,int y) {
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		cal.add(12,23);
	}
}
