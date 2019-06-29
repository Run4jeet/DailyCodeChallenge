package com.test.basic;

public class LinkedListOperation {

	public static void main(String[] args) {
		
		  LindkedList list = new LindkedList();
		  list.createList(10);
		  list.addNode(20);
		  list.addNode(30); 
		  list.addNode(40);
		  list.addNode(50);
		  list.display();
		  list.addFirst(200);
		  //System.out.println(" first list "+list.isCircular());
		 // list.createCircular();
		  list.display();
		 // System.out.println(" second list "+list.isCircular());
		 

		System.out.println();
	}
}
