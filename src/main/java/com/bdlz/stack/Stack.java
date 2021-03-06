package com.bdlz.stack;

public class Stack<K> extends MyLinkedList<K>{
	private final MyLinkedList myLinkedList;

	public Stack() {
		this.myLinkedList = new MyLinkedList();
	}
	
	public void push(INode myNode) {
		myLinkedList.add(myNode);
	}
	
	public INode peak() {
		return myLinkedList.head;
	}
	
	public INode pop() {
		return myLinkedList.pop();
	}

	public boolean isEmpty() {
		return myLinkedList.isEmpty();
	}
}
