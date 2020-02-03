package com.bosch.test;

import java.util.List;

import com.bosch.test.LinkedList.Node;

public class LinkedList  {
	
	private Node head;
	
	public static class Node{
		
		public Object data;
		public Node next;
		
		public Node(Object data){
			this.data= data;
			this.next=null;
		}
		
	}
	
    public void addFirst(Object data) {
    	if(head == null) {
    		head = new Node(data);
    	}
    	else {
    	Node newNode = new Node(data);
    	newNode.next=head;
    	head= newNode;
    	}
		
	}
    public void addMiddle(Object data, int position ) {
    	
    	int i=1;
    	if(head == null) {
    		head = new Node(data);
    	}
    	else {
    	Node newNode = new Node(data);
    	Node current = head;
    	while(i<position -1) {
    		i++;
    		current = current.next;
    	}
    	 newNode.next=current.next;
    	 current.next=newNode;
    	
    	}
		
	}
    public void addEnd(Object data) {
    	int count=0;
    	if(head == null) {
    		head = new Node(data);
    	}
    	else {
    	Node newNode = new Node(data);
    	Node current = head;
    	while(current.next != null) {
    		count++;
    		current= current.next;
    	}
    	
    	current.next=newNode;
    	
    	
    	}
		
	}
	@Override
	public String toString() {
		StringBuilder s= new StringBuilder();
		Node current = head;
		while(current!= null) {
			s.append(current.data + " ");
			current= current.next;
		}
		return s.toString();
	}

    
	public int size() {
		int count =0;
		
		if(head == null) {
    		return 0;
    	}else {
		
		Node current = head;
		while(current != null) {
			count ++;
			current=current.next;
		}
		return count;
	}
	}

}
