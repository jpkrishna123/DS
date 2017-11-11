package com.krishtech.linkedlist;

/** 
 * here merge two linked list into single linked list
 *  
 * @author jpkrishna
 *
 */
public class MergeLinkedList {
	
	private static ListNode<Integer> mergeLinkedList(ListNode<Integer> head1, ListNode<Integer> head2) {
		if(head1 == null) return head2;
		if(head2 == null) return head1;
		
		ListNode<Integer> dummyHead = new ListNode<>();
		ListNode<Integer> currentNode = dummyHead;
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
		// here prepare 1st linked list
		ListNode<Integer> head1 = new ListNode<>(5);
		LinkedListUtil.append(head1, 10);
		LinkedListUtil.append(head1, 15);
		
		// here prepare 2nd linked list
		ListNode<Integer> head2 = new ListNode<>(2);
		LinkedListUtil.append(head2, 7);
		LinkedListUtil.append(head2, 20);
		
		ListNode<Integer> mergeHead = mergeLinkedList(head1, head2);
		while(mergeHead != null) {
			System.out.println(mergeHead.getData());
			mergeHead = mergeHead.getNext();
		}
	}

}
