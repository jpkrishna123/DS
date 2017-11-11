package com.krishtech.linkedlist;

public class LLMerge {
	
	private static ListNode mergeLinkedList(ListNode<Integer> head1, ListNode<Integer> head2) {
		ListNode dummyHead = new ListNode();
		ListNode currentNode = dummyHead;
		ListNode<Integer> p1 = head1, p2 = head2;
		
		 while(p1 != null && p2 != null) {
			 if(p1.getData() < p2.getData()) {
				 currentNode.setNext(p1);
				 p1 = p1.getNext();
			 }else {
				 currentNode.setNext(p2);
				 p2 = p2.getNext();
			 }
			 
			 currentNode = currentNode.getNext();
		 }
		 
		 currentNode.setNext(p1 != null ? p1 : p2);
		 
		 return dummyHead.getNext();
	}
	
	public static void main(String []args) {
		ListNode head1 = new ListNode();
		head1.setData(5);
		
		ListNode node1 = new ListNode();
		node1.setData(10);
		head1.setNext(node1);
		
		ListNode node2 = new ListNode();
		node2.setData(15);
		node1.setNext(node2);
		
		ListNode head2 = new ListNode();
		head2.setData(2);
		
		ListNode node3 = new ListNode();
		node3.setData(7);
		head2.setNext(node3);
		
		ListNode node4 = new ListNode();
		node4.setData(20);
		node3.setNext(node4);
		
		ListNode mergeHead = mergeLinkedList(head1, head2);
		while(mergeHead != null) {
			System.out.println(mergeHead.getData());
			mergeHead = mergeHead.getNext();
		}
	}

}
