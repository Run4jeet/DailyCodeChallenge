package com.test.basic;

public class LindkedList {
	
	Node head;
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next =null;
		}
	}
	
public void createList(int data){
		Node first = new Node(data );
		head = first;
		head.next= null;
	}
	
public void addNode(int data){
		Node newNode = new Node(data );
		Node temp = head;
		while(temp.next!=null){
		
			temp = temp.next;
		}
		newNode.data=data;
		temp.next=newNode;
	}
	public void addFirst(int data) {
		Node first = new Node(data);
		Node temp;
		double i[]= {1,2};
		System.out.println(i);
		System.out.println(i.hashCode());
		String s= "s";
		System.out.println(s);
		temp = head;
		System.out.println("temp ass " +temp);
		System.out.println("temp ass " +temp.data);
		System.out.println("temp ass " +temp.next);
		head =first;
		first.next=temp.next;
	}
	
	public void createCircular() {
		Node temp = head;
		while(temp.next!=null) {
			temp= temp.next;
		}
		temp.next=head;
}

	public boolean isCircular() {
		
		Node stemp =head;
		Node ftemp =head;
		while(ftemp!=null && ftemp.next!=null ) {
			
			ftemp=ftemp.next.next;
			stemp = stemp.next;
			
			if(ftemp ==stemp) {
				return true;
			}
		}

		return false;
}
	
public void display(){
		Node temp;
		temp = head;
		System.out.print(temp.data + " " + "->");
		
		/*
		 * while(temp!=null) { System.out.print(temp.data + " " + "->"); temp
		 * =temp.next; }
		 */
		 
	}
}
