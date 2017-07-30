package com.sriram.ex1;

//Simple Linked List
//With ordered add i.e new elements are added to the end.

public class LinkedList {
  
  private Node head=null;
  
  public void add(Integer value) {
    if(head == null) {
      head = new Node(value);
    }else {
      getLastNode().next = new Node(value);
    }
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

  public void remove(Integer i) {
    Node current=head;
    Node previous = null;

    while(current != null )
    {
          if(current.data.equals(i)) 
          {
            if(previous != null) 
            {
              previous.next = current.next;
            }else 
            {
              head = current.next;
            }
          }
          else 
          {
            previous = current;
          }
          current = current.next;
     }
}
  
  private void reverse() {
    Node start =head;
    Node current=start;
     while(current.next !=null){
       current=current.next;
       
     }
  }


  public static void main(String[] args) {
    LinkedList list = new LinkedList();
        
    list.add(2);
    list.add(2);
    list.add(6);
    list.add(10);
    list.add(11);
    list.print();

    list.remove(2);
    //list.remove(2);
    //list.removeItem(10);
    list.print();
    list.reverse();
    
  }

  

}
