package com.bridgelabz.linkedlist;

public class Node <K> {
	K key;
	Node next;
	
	public Node() {
		
	}
	
	public Node(K key) {
		this.key = key;
		this.next = null;
	}
	
	public K getKey() {
		return key;
	}
	
	public void setkey(K key) {
		this.key = key;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
}
