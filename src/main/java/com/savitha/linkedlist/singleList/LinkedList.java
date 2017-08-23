/*Methods Supported
 * 
 * Create an Empty List 
 * 2.Check if it is empty
 * 3.get Size of the Linked List
 * 4.Append
 * 5.Prepend
 * 6.Print node
 * 7.Checks if it contains the element
 * 8.Get the element x
 * 9.Get the last element
 * 10.delete the node which the value x
 * 11.delete the first node
 * 12.delete the last node
 * 13.Reverse the single list+++
 * */

package com.savitha.linkedlist.singleList;

public class LinkedList<Anytype> {
  private Node<Anytype> head;
  int   size = 0;

  // Create an empty linked list
  public LinkedList() {
    head = null;// empty Linked List
 }

  public boolean isEmpty() {
    return head == null;
  }

  public int getsize() {
    return size;
  }

  public void append(Anytype item) {
    if (head == null) {
      head = new Node<Anytype>(item);
      size++;
    } else {
      Node<Anytype> current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = new Node<Anytype>(item);
      size++;
    }
  }

  public void prepend(Anytype item) {
    Node<Anytype> newNode = new Node<Anytype>(item);
    newNode.next = head;
    head = newNode;
    size++;

  }

  public void printdata() {
    Node<Anytype> current = head;

    while (current != null) {

      System.out.print(current.data + "->");
      current = current.next;
    }

    if (current == null) {
      System.out.print("null");
    }
    System.out.println("\n");
  }

  public boolean contains(int ele) {
    Node current = head;
    boolean found = false;

    while (current != null) {

      if (current.data.equals(ele)) {
        found = true;
        break;
      }
      current = current.next;
    }
    return found;
  }

  public Object getelement(int index) {
    Node current = head;
    int count = 0;
    Object result = null;
    int listsize = getsize();
    if (listsize == index) {
      result = getLastEle();
    }

    while (current.next != null) {
      count++;
      if (count == index) {
        return current.data;
      }
      current = current.next;

    }
    return result;
  }

  /*
   * private void printdatainReverse() { Node<Anytype> currentcurrent = head; if
   * (current == null) {
   * 
   * return; } printdatainReverse(current.next);
   * System.out.println(current.data); }
   */

  private Object getLastEle() {
    Node current = head;
    while (current.next != null) {
      current = current.next;

    }
    return current.data;

  }

  public void deletewithValue(Anytype item) {
    if (head == null)
      return;
    if (head.data == item) {
      head = head.next;
      return;
    }
    Node<Anytype> current = head;
    while (current.next != null) {
      if (current.next.data == item) {
        current.next = current.next.next;
        return;
      }
      current = current.next;
    }
  }

  public void deletefirst() {
    Node<Anytype> last = head;
    Node<Anytype> previoustoLast = null;
    if (head == null) {
      return;
    }
    head = last.next;
  }

  public void deletelast() {
    Node<Anytype> last = head;
    Node<Anytype> previoustoLast = null;
    if (last.next == null) {
      last = null;
      return;
    }
    while (last.next != null) {
      previoustoLast = last;
      last = last.next;
    }
    previoustoLast.next = null;

  }// Add more functionalities like getfirst,get
   // last,getmiddle,getelement,contains,insertinOrder etc

  public void reverse() {
    Node<Anytype> ptrA = null;
    Node<Anytype> ptrB = head;
    // ptrA.next = null;
    while (ptrB != null) {
      Node<Anytype> ptrC = ptrB.next;
      ptrB.next = ptrA;

      ptrA = ptrB;
      ptrB = ptrC;

    }
    head = ptrA;
  }

  public static void main(String[] args) {

    LinkedList<String> list = new LinkedList<String>();
    LinkedList<String> reverseListHead = new LinkedList<String>();

    System.out.println(list.isEmpty());
    list.append("Sriram");
    list.append("Savitha");
    list.prepend("Isha");
    list.append("kutty baby");
    System.out.println(list.getsize());
    System.out.println(" ");
    list.printdata();
    // System.out.println("After Reversing:");
    // list.deletewithValue("Sriram");
    // list.printdata();
    // list.reverse();
    // list.printdata();
    // list.deletelast();
    // list.printdata();
    // list.deletefirst();
    // list.printdata();
    Object value = list.getelement(4);
    System.out.println(value);

  }

}
