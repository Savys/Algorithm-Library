package com.savitha.slinkedlist.ex2.withoutGen;

//Simple Linked List
//With ordered add i.e new elements are added to the end.
//In this vesion we have implemented Generic for Node. So now Node can contain any Object
/*
* Methods Supported: 
* 1.add
* 2.GetlastNode
* 3.Print
* 4.Remove a node
* */
public class LinkedList<T> {

private Node<T> head=null;

public void add(T value) {
  if(head == null) {
    head = new Node<T>(value);
  }else {
    getLastNode().next = new Node<T>(value);
  }
}

private Node<T> getLastNode() {
  Node<T> current = head;
  while(current != null && current.next != null) {
    current = current.next;
  }
  return current;
}

public void print() {
  Node<T> current = head;
  while(current != null) {
    System.out.print(current.data + " ->");
    current = current.next;
  }
  System.out.print("null");
  System.out.println("");

}
  

public void remove(T i) {
  Node<T> current=head;
  Node<T> previous = null;
  
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
  Node<T> start =head;
  Node<T> current=start;
   while(current.next !=null){
     current=current.next;
     
   }
}*/


public static void main(String[] args) {
  LinkedList<Integer> list = new LinkedList<Integer>();
    
  list.add(new Integer(2));
  list.add(new Integer(2));
  list.add(new Integer(6));
  list.add(new Integer(10));
  list.add(new Integer(11));
  list.print();

  list.remove(new Integer(2));
  //list.remove(2);
  //list.removeItem(10);
  list.print();
 //list.reverse();
  
}



}
