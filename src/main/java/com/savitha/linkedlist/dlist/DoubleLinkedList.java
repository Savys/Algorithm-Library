package com.savitha.linkedlist.dlist;


public class DoubleLinkedList {

  Node first;
  Node last;
  int size=1;
  
  public void addfirst(String f)
  {
    Node newFirst=new Node(f,null,null); 
    newFirst.next=first;
    first=newFirst;
   
  }
  public void addLast(String f)
  {
    
  }
  public void get()
  {
    
  }
  public void getLast()
  {
    
  }
  public void print()
  {
    
  }
  public int getsize()
  {
    return size;
  }
  public static void main(String[] args) {
    DoubleLinkedList dl=new DoubleLinkedList();
    int resultsize =dl.getsize();
    System.out.print(resultsize);
    
   
   

  }

}
