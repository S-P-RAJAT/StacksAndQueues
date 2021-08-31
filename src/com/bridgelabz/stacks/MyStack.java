package com.bridgelabz.stacks;

import com.bridgelabz.linkedlist.*;

public class MyStack<K> 

{
	private final MyLinkedList<K> myLinkedList;
	
	public MyStack() 
	{
		this.myLinkedList = new MyLinkedList<K>();
	}
	
	public void push(INodeIF<K> newNode)
	{
		myLinkedList.addNode(newNode);
		
	}
	
	public void printStack()
	{
		myLinkedList.printNodes();
	}
	
	public INodeIF<K> peek()
	{
		return myLinkedList.head;
	}
	
}