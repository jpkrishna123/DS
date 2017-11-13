package com.krishtech.linkedlist;

/**
 *  ListNode : 
 *     data : Generic Type
 *     
 * @author jpkrishna
 *
 */
public class ListNode<T> {
	public T data;
	public ListNode<T> next;
	
	public ListNode() {
	}
	
	public ListNode(T data) {
		this.data = data;
		this.next = null;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public ListNode<T> getNext() {
		return next;
	}
	
	public void setNext(ListNode<T> next) {
		this.next = next;
	}
	
}
