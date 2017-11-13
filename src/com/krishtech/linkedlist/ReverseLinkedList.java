package com.krishtech.linkedlist;

/** this program used to reverse the linked list
 * 
 * @author jpkrishna
 *
 */
public class ReverseLinkedList {
	
	private static ListNode<Integer> reverseByRecursive(ListNode<Integer> root) {
		if(root == null) return null;
		
		ListNode<Integer> p = root;
		ListNode<Integer> q = root.next;
		
		if(q == null) return p;
		
		q = reverseByRecursive(q);
		p.next.next = p;
		p.next = null;
		
		return q;
	}
	
	private static ListNode<Integer> reverse(ListNode<Integer> node) {
        
		ListNode<Integer> current = node;
		ListNode<Integer> prev = null;
		ListNode<Integer> next = null;
        
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return prev;
    }
	
	private static ListNode<Integer> reverseByK(ListNode<Integer> head, int k) {
		ListNode<Integer> current = head;
		ListNode<Integer> next = null;
        ListNode<Integer> prev = null;
        
       int count = 0;
 
       /* Reverse first k nodes of linked list */
       while (count < k && current != null)
       {
           next = current.next;
           current.next = prev;
           prev = current;
           current = next;
           count++;
       }
 
       /* next is now a pointer to (k+1)th node 
          Recursively call for the list starting from current.
          And make rest of the list as next of first node */
       if (next != null) 
          head.next = reverseByK(next, k);
 
       // prev is now head of input list
       return prev;
    }  
	
	public static void main(String []args) {
		ListNode<Integer> r = new ListNode<>(1);
		LinkedListUtil.append(r, 2);
		LinkedListUtil.append(r, 3);
		LinkedListUtil.append(r, 4);
		LinkedListUtil.append(r, 5);
		LinkedListUtil.append(r, 6);
		
		//here reverse the linked list by recursive
		ListNode<Integer> rn = reverseByRecursive(r);
		LinkedListUtil.display(rn);
		
		//here reverse the linked list
		rn = reverse(r);
		LinkedListUtil.display(rn);
		
		//here reverse the linked list by kth node
		rn = reverseByK(r, 2);
		LinkedListUtil.display(rn);
	}
}
