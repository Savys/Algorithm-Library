package com.linkedlist;

public class Node {
 public String item;
 public Node next;
 public Node prev;
 
  Node(Node prev, String element, Node next) {
      this.item = element;
      this.next = next;
      this.prev = prev;
  }
   
}
