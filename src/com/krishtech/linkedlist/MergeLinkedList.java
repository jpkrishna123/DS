package com.krishtech.linkedlist;

public class MergeLinkedList {
	
	static class Node {
		int v;
		Node next;
		
		public Node(int v) {
			this.v = v;
		}
	}
	
	private static Node mergeLinkedList(Node p, Node q) {
		Node newHead;
		Node sorting;
		if(p == null) return q;
		if(q == null) return p;
		
		if(p.v < q.v) {
			sorting = p;
			p = sorting.next;
		}else {
			sorting = q;
			q = sorting.next;
		}
		
		newHead = sorting;
		while(p != null && q != null) {
			if(p.v < q.v) {
				sorting.next = p;
				sorting = p;
				p = sorting.next;
			}else {
				sorting.next = q;
				sorting = q;
				q = sorting.next;
			}
		}
		
		if(p == null) sorting.next = q;
		if(q == null) sorting.next = p;
		
		return newHead;
	}
	
	private static void display(Node node) {
		Node p = node;
		
		while(p != null) {
			System.out.print(" " + p.v + " -> ");
			p = p.next;
		}
	}
	
	public static void main(String []args) {
		Node r = new Node(1);
		Node n1 = new Node(3);
		r.next = n1;
		Node n2 = new Node(5);
		n1.next = n2;
		Node n3 = new Node(7);
		n2.next = n3;
		Node n4 = new Node(9);
	    n3.next = n4;
		
	    
	    Node r1 = new Node(2);
		Node rn1 = new Node(4);
		r1.next = rn1;
		Node rn2 = new Node(6);
		rn1.next = rn2;
		
		Node head = mergeLinkedList(r, r1);
	    display(head);
		
	}
	
	
}
