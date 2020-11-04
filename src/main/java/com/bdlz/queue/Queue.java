package com.bdlz.queue;

import com.bdlz.queue.MyLinkedList;

import com.bdlz.queue.INode;

public class Queue<K> extends MyLinkedList<K> {

	private final MyLinkedList myLinkedList;

	public Queue() {
		this.myLinkedList = new MyLinkedList<>();
	}

	public void enque(INode myNode) {
		myLinkedList.append(myNode);
	}

	public INode peak() {
		return myLinkedList.head;
	}

	public INode deque() {
		return myLinkedList.pop();
	}
}
