package coll5;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		//Create a stack
		Stack<Integer> stack = new Stack<>();
		
		//Push elements on to the stack
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		//Display the elements of the stack
		System.out.println("Stack:"+stack);
		
		//Pop the element from the stack
		//int poppedElement = stack.pop();
		//System.out.println("Popped Element:"+poppedElement);
		
		//Display the element of the stack after popping
		System.out.println("Stack after popping:"+stack);
		
		//Peek at the top element of the stack without removing it
		int topElement = stack.peek();
		System.out.println("Top element:"+topElement);
		
		//Check if the stack is empty
		boolean isEmpty = stack.isEmpty();
		System.out.println("is stack empty()?"+isEmpty);
		
		//Get the size of the stack
		int size = stack.size();
		System.out.println("Size of the stack:"+size);
		
		
		

	}

}
