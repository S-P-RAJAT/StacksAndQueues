package com.bridgelabz.queues;

import com.bridgelabz.linkedlist.*;

public class MyQueue<K> {
	private final MyLinkedList<K> myLinkedList;

	public MyQueue() {
		this.myLinkedList = new MyLinkedList<K>();
	}

	public void enqueue(INodeIF<K> newNode) {
		myLinkedList.appendNode(newNode);

	}

	public void printQueue() {
		myLinkedList.printNodes();
	}
	public INodeIF<K> dequeue()
	{
		
		return myLinkedList.pop();
	}
	
	public boolean isEmpty()
	{
		return myLinkedList.isEmpty();
	}
	
	public int size() 
	{
		return myLinkedList.size();
	}
}
