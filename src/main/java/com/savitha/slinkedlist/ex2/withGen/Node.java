package com.savitha.slinkedlist.ex2.withGen;

public class Node<T> {
  public T data;
  public Node<T> next;
  
  public Node(T data)
  {
    this.data=data;
    //this.next = next;
  }


}