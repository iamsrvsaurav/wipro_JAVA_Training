package coll6;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

	public static void main(String[] args) {
		//Create a deque
		
		Deque<Integer> deque = new ArrayDeque<>();
		
		//Add element to the first and back of the deque
		deque.addFirst(1);//Add to front
		deque.addLast(2);//Add to last
		deque.addFirst(3);//Add to front
	
		//Display the element of the deque
		System.out.println("Deque:"+deque);
		
		//Remove elements from front and back of the deque
		//int removeFirst = deque.removeFirst();//Remove from front
		//int removeLast = deque.removeLast();//Remove from the back
		
		//Display the removed elements
		//System.out.println("Removed First Element:"+removeFirst);
		//System.out.println("Removed Last Element:"+removeLast);
		
		//Display the elements after removal
		//System.out.println("Deque after removal:"+deque);
		
		/*int firstElement = deque.peekFirst();
		int lastElement = deque.peekLast();
		System.out.println("First element:"+firstElement);
		System.out.println("Last element:"+ lastElement);*/
		
		//Check if the the deque is empty
		boolean isEmpty = deque.isEmpty();
		System.out.println("Is the deque empty:"+isEmpty);
		
		//Get the size of the deque
		int size = deque.size();
		System.out.println("Size of deque"+size);
		
		
		
		

	}

}
