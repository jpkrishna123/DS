package com.krishtech.linkedlist;


/**
 * this program will check the given linked list is cyclic?
 * 
 * @author jpkrishna
 *
 */
public class CyclicLinkedList {

	private static ListNode<Integer> getCyclicNode(ListNode<Integer> root) {
		boolean isCyclic = false;
		
		ListNode<Integer> n1 = root; // slow moving
		ListNode<Integer> n2 = root; // fast moving
		while(n1 != null && n1.getNext() != null && 
				n2 != null && n2.getNext() != null) {
			n1 = n1.getNext();
			n2 = n2.getNext().getNext();
			if(n1 == n2) {
				isCyclic = true;
				break;
			}
		}
		
		if(n2.getNext() == null) {
			return null;
		}
		
		if(isCyclic) {
			n1 = root;
			while(n1 != n2) {
				n1 = n1.getNext();
				n2 = n2.getNext();
			}
		}
		
		return n2;
	}     
	
	public static void main(String []args) {
		ListNode<Integer> r = new ListNode<>(1);
		LinkedListUtil.append(r, 2);
		LinkedListUtil.append(r, 3);
		ListNode<Integer> n4 = LinkedListUtil.append(r, 4);
		LinkedListUtil.append(r, 5);
		ListNode<Integer> n6 = LinkedListUtil.append(r, 6);
		n6.setNext(n4);
		
		System.out.println("Cyclic Node : " + getCyclicNode(r));
	}
}
