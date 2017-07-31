package com.savitha.GayleSoln;

import com.savitha.GayleSoln.Node;

public class LinkedListImpl implements iLinkedL{
  int size=0;
  Node first;
  Node last;

  public int getSize() {
    return size;
  }
  public void print() {
    Node  current =first;

    while(current !=null )
    {
      System.out.println(current.Item);
      current=current.next;
    }

  }  

  @Override
  public boolean contains(String s) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public String get(int index) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getFirst() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getLast() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void addFirst(String f) {
    Node newfirst = new Node(f,null);
    newfirst.next=first;
    first =newfirst;     
    size++;

  }




  @Override
  public void addLast(String f) {
    // TODO Auto-generated method stub

  }

  @Override
  public void add(String f) {
    Node current=first;
    Node prev=first;
    while(current !=null)
    {
      if(current.Item.compareTo(f)>0)
      {
        Node newNode=new Node(f,current);

        prev.next=newNode;
        size++;
        break;
      }
    prev=current;
    current=current.next;
    }
  }

  @Override
  public String removeFirst() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String removeLast() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String removeDup() {
    // TODO Auto-generated method stub
    return null;
  }

  public static void main(String[] args)
  {
    LinkedListImpl LinkedData=new LinkedListImpl();
    System.out.println("Size Initially:"+LinkedData.getSize());
    LinkedData.addFirst("Isha");
    //System.out.println("Size After addFirst :"+LinkedData.getSize());
    // LinkedData.print();
    LinkedData.add("ASavitha");
    System.out.println("Linked list size: "+LinkedData.getSize());
    LinkedData.print();


  }



}
