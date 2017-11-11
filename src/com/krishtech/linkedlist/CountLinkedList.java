package com.krishtech.linkedlist;;

/**
 * count no of elements in linked list
 * 
 * @author jpkrishna
 *
 */
public class CountLinkedList {

	private static int getLength(final ListNode<Integer> node) {
		int c = 0;
		ListNode<Integer> p = node;
		while(p != null) {
			c++;
			p = p.getNext();
		}
		
		return c;
	}
	
	public static void main(String []args) {
		ListNode<Integer> r = new ListNode<>(1);
		LinkedListUtil.append(r, 2);
		LinkedListUtil.append(r, 3);
		LinkedListUtil.append(r, 4);
		System.out.println("Count : " + getLength(r));
	}

}
