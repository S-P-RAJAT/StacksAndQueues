package com.bridgelabz.queues;

import com.bridgelabz.linkedlist.MyNodeImpl;

public class QueueMain {

	public static void main(String[] args) 
	
	{
		MyQueue<Integer> queue = new MyQueue<Integer>();
		MyNodeImpl<Integer> firstNode = new MyNodeImpl<Integer>(70);
		MyNodeImpl<Integer> secondNode= new MyNodeImpl<Integer>(30);
		MyNodeImpl<Integer> thirdNode = new MyNodeImpl<Integer>(56);
		
		queue.enqueue(firstNode);
		queue.enqueue(secondNode);
		queue.enqueue(thirdNode);
		queue.printQueue();

	}

}