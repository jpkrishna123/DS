package com.krishtech.linkedlist;


public class CyclicLinkedList {

	static class Node {
		int v;
		Node next;
		
		public Node(int v) {
			this.v = v;
		}
	}
	
	private static Node getCyclicNode(Node root) {
		boolean isCyclic = false;
		
		
		Node n1 = root; // slow moving
		Node n2 = root; // fast moving
		while(n1 != null && n1.next != null && 
				n2 != null && n2.next != null) {
			n1 = n1.next;
			n2 = n2.next.next;
			if(n1 == n2) {
				isCyclic = true;
				break;
			}
		}
		
		if(n2.next == null) {
			return null;
		}
		
		n1 = root;
		while(n1 != n2) {
			n1 = n1.next;
			n2 = n2.next;
		}
		
		return n2;
	}
	
	private static Node nthLast(Node root, int pos) {
		Node n1 = root;
		Node n2 = root;
		
		for(int i = 0; i < pos -1; i++) {
			if(n2 == null)  return null;
			
			n2 = n2.next;
		}
		
		while(n2.next != null) {
			n1 = n1.next;
			n2 = n2.next;
		}
		
		return n1;
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
		
		Node head = reverse(r);
		System.out.println(head.v);
		//Node n = nthLast(r, 2);
		//System.out.println("isCyclic : " + n.v);
	}
}
