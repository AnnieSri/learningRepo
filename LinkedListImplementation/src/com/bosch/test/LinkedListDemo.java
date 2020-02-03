package com.bosch.test;

import java.util.List;

//import com.bosch.test.LinkedList.Node;

public class LinkedListDemo {

	public static void main(String[] args) {
		
	LinkedList list = new LinkedList();
	System.out.println("LIST SIZE "+list.size());
	list.addEnd(12);
	list.addEnd(13);
	list.addEnd(15);
	list.addEnd(33);
	list.addEnd(93);
	
	list.addFirst(2);
	list.addFirst(3);
	list.addFirst(8);
	System.out.println(list );
	System.out.println("LIST SIZE "+list.size());
	
	list.addMiddle(100, 4);
	list.addMiddle(200, 7);
	System.out.println(list);
	System.out.println("LIST SIZE "+list.size());
	}
	
}
