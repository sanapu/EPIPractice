package com.epipractice.implement;

public class DoublyLinkedList {
	Node headNode;
	int size =0;
	
	public void add(int data) {
		Node currentNewNode = new Node(data);
		
		if(headNode == null) {
			headNode = currentNewNode;
		}else {
			Node refNode = headNode;
			while(refNode.next != null) {
				refNode = refNode.next;
			}
			refNode.next = currentNewNode;
			currentNewNode.previous = refNode;
		}
		size++;
		
	}
	
	
	public void addFirst(int data) {
		Node currentNewNode = new Node(data);
		
		//Node refNode = headNode;
		if(headNode.previous == null) {
			Node ref = headNode;
			
		headNode = currentNewNode;
		currentNewNode.next = ref;
		ref.previous = currentNewNode;

		}
		size++;
		
		
		/*
		 * Kyles version
		 */
		
		/*Node newNode = new Node(data);
		
		if(headNode == null)
		{
			headNode = newNode;
		}
		else
		{
			headNode.previous = newNode;
			newNode.next = headNode;
			headNode = newNode;
		}
		*/
			
		
	}
	public int getSize() {
		return size;
	}
	
	protected Node getNodeAtIndex() {
		
	}
	
	
	
	public String toString() {
		String s = "";
		Node refNode = headNode;
		while(refNode.next != null) {
			
			s= s+""+refNode.data;
			refNode = refNode.next;
		}
		s= s+""+refNode.data +"last previous "+ refNode.previous.data;
		
		return s;
	}
	
		
	class Node{
		
		Node next;
		Node previous;
		int data;
		
		Node(int data){
			this.data = data;
		}
		
	}

}
