package com.bridgelabz.linkedlist;

public class LinkedListOperations {
	//Represent the head and tail of the singly linked list
	INode head;
	INode tail;
	int size;

	// add Node
	public void addNodeInBeginning(Node newNode) {
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            INode temp = head;
            head = newNode;
            head.setNext(temp);
        }
    }

	// add node at the end 
    public void addNodeAtEnd(Node newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    // add node in middle
    public void addNodeInMiddle(Node newNode) {

        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            INode temp, current;
            int count = (size % 2 == 0) ? (size/2) : ((size + 1) / 2);
            temp = head;
            current = null;
            for(int i=0; i<count; i++) {
                current = temp;
                temp = temp.getNext();
            }
            current.setNext(newNode);
            newNode.setNext(temp);
        }
        size++;
    }

    // delete node from the beginning
    public void deleteNodeFromBeginning() {
        if(head == null)
            System.out.println("Linked List is empty!");
        else
            head = head.getNext();
    }

    // display node  
    public void displayNode() {
        INode current = head;
        if(head == null)
            System.out.println("Linked List is empty");
        System.out.print("Nodes are: " );
        while (current != null) {
            if(current.getNext() != null) {
                System.out.print(current.getKey() + " -> ");
                current = current.getNext();
            }
            else {
                System.out.println(current.getKey());
                current = current.getNext();
            }
        }
    }
}
