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
	
	
	
	private static Node reverse(Node root) {
		if(root == null) return null;
		
		Node p = root;
		Node q = root.next;
		
		if(q == null) return p;
		
		q = reverse(q);
		p.next.next = p;
		p.next = null;
		
		return q;
	}
	
	private Node reverseLN(Node node) {
        
        Node current = node;
        Node prev = null;
        Node next = null;
        
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return prev;
    }
	
	private Node reverseByK(Node head, int k)
    {
       Node current = head;
       Node next = null;
       Node prev = null;
        
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
		ListNode<Integer> n4 = LinkedListUtil.append(r, 4);
		LinkedListUtil.append(r, 5);
		ListNode<Integer> n6 = LinkedListUtil.append(r, 6);
		n6.setNext(n4);
		
		System.out.println("Cyclic Node : " + getCyclicNode(r));
	}
}
