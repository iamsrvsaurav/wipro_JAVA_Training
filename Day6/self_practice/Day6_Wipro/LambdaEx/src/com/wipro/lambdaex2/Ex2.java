package com.wipro.lambdaex2;
interface Sayable{
	public String say(String name);
}
public class Ex2 {

	public static void main(String[] args) {
		Sayable s1  = (name) -> {
			return "Hello, "+name;
		};
		System.out.println(s1.say("Rakesh Srivastaw"));
		

	}

}
