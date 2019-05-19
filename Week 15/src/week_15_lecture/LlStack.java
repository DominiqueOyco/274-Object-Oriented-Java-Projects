package week_15_lecture;

import java.util.NoSuchElementException;

public class LlStack {
	
	class Node{
		public Object data;
		public Node next;
	}
	
	private Node first;
	private int size;
	
	public void push(Object data){
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		first = newNode;
		size++;
	}
	
	public Object pop(){
		if(first == null){throw new NoSuchElementException();}
		Object tobeRemoved = first.data;
		first = first.next;
		size--;
		return tobeRemoved;
	}
	
	/**
	 * returns the contents of the first element in the stack
	 * @return an Object containing the data of the first element
	 **/
	public Object peek(){
		if(first == null){throw new NoSuchElementException();}
		return first.data;
	}
	
	/**
	 * gets the current size of the stack
	 * @return the number of elements in the stack as an integer
	 */
	public int size(){
		return this.size;
	}
	
	public static void main(String[] args){
		LlStack s = new LlStack();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s.peek()); //Expecting: 3
		while(s.size() > 0){
			System.out.println(s.pop()); //Expecting: 3 2 1
		}
	}
}
