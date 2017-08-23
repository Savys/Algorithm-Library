package com.savitha.slinkedlist;

/**
 * Methods supported 1. Return size, 2. Print node, 3. Check if it Contains,
 * 4.get FirstElement 5.get last element 6.get Element(ele), 7. addLast 8. get
 * First element, 9. removeFirst
 * 
 * */

public class LinkedList implements iLinkedList {

  int  size = 0;
  Node first;
  Node last;

  public LinkedList() {
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public void print() {
    Node current = first;
    System.out.println("Data is :");
    while (current != null) {
      System.out.println(current.item);
      current = current.next;
    }

  }

  @Override
  public boolean contains(String s) {
    Node current = first;
    boolean found = false;
    while (current != null) {
      if (current.item.equals(s)) {
        found = true;
        break;
      }
      current = current.next;
    }

    return found;
  }

  @Override
  public String getFirst() {
    return first.item;
  }

  @Override
  public String getLast() {
    return last.item;
  }

  @Override
  public String get(int index) {
    Node current = first;
    int curerentindex = 0;
    String datatoReturn = null;
    while (current != null) {

      if (curerentindex == index - 1) {
        datatoReturn = current.item;
        break;
      }
      curerentindex++;
      current = current.next;
    }
    return datatoReturn;
  }

  @Override
  public String removeFirst() {
    String ElementRemoved = first.item;
    first = first.next;
    size--;
    return ElementRemoved;
  }

  public String removeLast() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void addFirst(String f) {
    Node newfirst = new Node(f, null);
    newfirst.next = first;
    first = newfirst;
    size++;

  }

  @Override
  public void addLast(String f) {
    if (last == null) {
      first = new Node(f, null);
      last = first;
      size++;
    } else {
      Node newNode = new Node(f, null);
      last.next = newNode;
      last = newNode;
      size++;

      // last = new Node(last,f,null);
      // size++;
    }
  }

  @Override
  public void add(String f) {
    Node current = first;
    Node prev = first;
    while (current != null) {
      if (current.item.compareTo(f) > 0) {
        Node newNode = new Node(f, current);
        prev.next = newNode;
        break;
      }
      prev = current;
      current = current.next;
    }
  }

  public static void main(String[] args) {
    LinkedList listData = new LinkedList();
    System.out.println("Size of the list is :" + listData.size());
    listData.addLast("A");
    listData.addLast("B");
    // listData.addLast("C");
    listData.addLast("D");
    listData.add("B");
    listData.addLast("E");
    listData.print();
    boolean result = listData.contains("B");
    System.out.println("Does the list contain B: " + result);
    /*
     * String lastEle=listData.getLast();
     * System.out.println("Last Element is "+lastEle); String
     * ele=listData.get(2);
     * System.out.println("Size of the list is :"+listData.size() + ele);
     * listData.print(); String firstElem=listData.getFirst();
     * System.out.println("First element is " +firstElem); String ElemRemoved
     * =listData.removeFirst(); System.out.println("First Element removed is "
     * +ElemRemoved+" And Size of the list is " + listData.size());
     * 
     * String lastElemRemoved=listData.removeLast();
     * System.out.println("Last Element removed is " +lastElemRemoved);
     * //listData.print(); listData.addFirst("Z");
     * System.out.println("Size of the list now is :"+listData.size());
     * System.out.println("Printing the list "); //listData.print(); String
     * Elem=listData.removeLast(); System.out.println("Last Element removed is "
     * +Elem); //listData.print(); String Elem1=listData.removeLast();
     * System.out.println("Last Element1 removed is " +Elem1);
     * //listData.print(); String Elem2=listData.removeLast();
     * System.out.println("Last Element2 removed is " +Elem2);
     * //listData.print(); String Elem3=listData.removeLast();
     * System.out.println("Last Element3 removed is " +Elem3);
     */

  }

}
