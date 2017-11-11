package com.krishtech.linkedlist;

/**
 * this program will get the nth linked list node
 * 
 * @author jpkrishna
 *
 */
public class NthLastNode {
	
	private static ListNode<Integer> nthLast(ListNode<Integer> root, int pos) {
		ListNode<Integer> n1 = root;
		ListNode<Integer> n2 = root;
		
		for(int i = 0; i < pos -1; i++) {
			if(n2 == null)  return null;
			n2 = n2.getNext();
		}
		
		while(n2.getNext() != null) {
			n1 = n1.getNext();
			n2 = n2.getNext();
		}
		
		return n1;
	}
	
	public static void main(String []args) {
		ListNode<Integer> r = new ListNode<>(1);
		LinkedListUtil.append(r, 2);
		LinkedListUtil.append(r, 3);
		LinkedListUtil.append(r, 4);
		LinkedListUtil.append(r, 5);
		LinkedListUtil.append(r, 6);
		
		System.out.println("Cyclic Node : " + nthLast(r, 2));
	}
}
