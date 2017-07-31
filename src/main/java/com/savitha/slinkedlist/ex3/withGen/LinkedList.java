package com.savitha.slinkedlist.ex3.withGen;

//Simple Linked List
//With ordered add i.e new elements are added to the end.
/*
 * Methods Supported: 
 * 1.add
 * 2.GetlastNode
 * 3.Print
 * 4.Remove a node
 * */
public class LinkedList {

private Node head=null;

public void add(Object value) {
  if(head == null) {
    head = new Node(value);
  }else {
    getLastNode().next = new Node(value);
  }
}

public void increment() {
  Node current = head;
  while(current != null) {
    current.data = (Integer) current.data +1;
    current = current.next;
  }
  System.out.print("null");
  System.out.println("");
}

private Node getLastNode() {
  Node current = head;
  while(current != null && current.next != null) {
    current = current.next;
  }
  return current;
}

public void print() {
  Node current = head;
  while(current != null) {
    System.out.print(current.data + " ->");
    current = current.next;
  }
  System.out.print("null");
  System.out.println("");

}
  

public void remove(Object i) {
  Node current=head;
  Node previous = null;
  
  while(current != null ) {
    if(current.data.equals(i)) {
      if(previous != null) {
        previous.next = current.next;
      }else {
        head = current.next;
      }
    }else {
      previous = current;
    }
    current = current.next;
  }
}
/* 
private void reverse() {
  Node start =head;
  Node current=start;
   while(current.next !=null){
     current=current.next;
     
   }
}
*/

public static void main(String[] args) {
  LinkedList list = new LinkedList();
    
  list.add(new Integer(2));
  list.add(new String("2"));
  list.add(new Integer(6));
  list.add(new Integer(10));
  list.add(new Integer(11));
  list.add(new String("11"));
  list.print();
  list.increment();

  //list.remove(new Integer(2));
  //list.remove(2);
  //list.removeItem(10);
  list.print();
  //list.reverse();
  
}



}
