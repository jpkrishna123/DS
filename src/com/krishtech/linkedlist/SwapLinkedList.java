package com.krishtech.linkedlist;

public class SwapLinkedList {
	
	static class Node {
		int v;
		Node next;
		
		public Node(int v) {
			this.v = v;
		}
	}
	
	public static void main(String []args) {
		Node r = new Node(1);
		Node n1 = new Node(2);
		r.next = n1;
		Node n2 = new Node(3);
		n1.next = n2;
		Node n3 = new Node(4);
		n2.next = n3;
		Node n4 = new Node(5);
		n3.next = n4;
		Node n5 = new Node(6);
		n4.next = n5;
		//n5.next = n3;
		
		//Node head = reverse(r);
		System.out.println(r.v);
		//Node n = nthLast(r, 2);
		//System.out.println("isCyclic : " + n.v);
	}

}
