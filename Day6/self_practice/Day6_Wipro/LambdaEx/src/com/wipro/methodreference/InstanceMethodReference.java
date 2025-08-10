package com.wipro.methodreference;
interface Sayable{
	void say();
}
public class InstanceMethodReference {
	public void saySomething() {
		System.out.println("Non Static method");
	}
	public static void main(String[] args) {
		InstanceMethodReference i =
				new InstanceMethodReference();
		//Refering non-static method reference
		Sayable sayable = i::saySomething;
		sayable.say();

	}

}
