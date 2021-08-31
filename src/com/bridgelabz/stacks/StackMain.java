package com.bridgelabz.stacks;

import com.bridgelabz.linkedlist.MyNodeImpl;

public class StackMain 
{
	public static void main(String args[]) 
	
	{
		MyStack<Integer> stack = new MyStack<Integer>();
		MyNodeImpl<Integer> firstNode = new MyNodeImpl<Integer>(70);
		MyNodeImpl<Integer> secondNode= new MyNodeImpl<Integer>(30);
		MyNodeImpl<Integer> thirdNode = new MyNodeImpl<Integer>(56);
		
		stack.push(firstNode);
		stack.push(secondNode);
		stack.push(thirdNode);
		System.out.println("Element at top :"+stack.peek().getKey());
		stack.printStack();
	}

}
