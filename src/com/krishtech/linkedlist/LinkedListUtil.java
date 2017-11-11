package com.krishtech.linkedlist;

/**
 * This class contains the Linked List util methhods
 *  - Display Nodes
 *  - Delete Nodes
 *  
 * @author jpkrishna
 *
 */
public class LinkedListUtil {
	
	@SuppressWarnings("rawtypes")
	public static void display(final ListNode node) {
		ListNode p = node;
		
		while(p != null) {
			System.out.print(" " + p.getData() + " -> ");
			p = p.getNext();
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static ListNode append(final ListNode<Integer> root, int v) {
		ListNode<Integer> n = root;
		ListNode<Integer> p = root;
		
		while(n != null) {
			p = n;
			n = n.getNext();
		}
		
		ListNode<Integer> node = new ListNode<Integer>(v);
		p.setNext(node);
		
		return root;
	}
	
	@SuppressWarnings("rawtypes")
	public static ListNode delete(ListNode<Integer> root, int v) {
		ListNode<Integer> head = root;
		ListNode<Integer> p = root;
		ListNode<Integer> prev = null;
		
		while(p != null) {
			if(p.getData() == v) {
				if(prev == null) {
					head = p.getNext();
				}else {
					prev.setNext(p.getNext());
				}
			}
			
			prev = p;
			p = p.getNext();
		}
		
		return head;
	}
}
