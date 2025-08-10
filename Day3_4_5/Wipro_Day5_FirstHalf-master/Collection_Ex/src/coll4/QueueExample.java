package coll4;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		//Create a queue
		Queue<Integer> queue = new LinkedList<>();
		
		//Add element to the queue
		queue.add(1);
		queue.add(2);
		queue.add(3);
		
		//Display the element of the queue
		System.out.println("Queue:"+queue);
		
		//Remove elements from the queue
		//int removeElement = queue.remove();
		//System.out.println("Removed element:"+removeElement);
		
		//Display the element after removal
		System.out.println("Queue after removal:"+queue);
		
		//Peek at the first element of the queue without removing it
		//int firstElement = queue.peek();
		//System.out.println("First Element:"+firstElement);
		
		//Check if the queue is empty
		boolean isEmpty = queue.isEmpty();
		System.out.println("Is the queue empty?"+isEmpty);
		
		//Get the size of the queue
		int size = queue.size();
		System.out.println("Size of the queue:"+size);
		
		
		

	}

}
