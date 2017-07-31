package com.savitha.slinkedlist;


public interface iLinkedList {
  public int size();
  public void print();

  public boolean contains(String s);
  public String get(int index);
  public String getFirst();
  public String getLast();

  public void addFirst(String f);
  public void addLast(String f);
  public void add(String f);
  
  public String removeFirst();
  public String removeLast();
  
 
  

}
