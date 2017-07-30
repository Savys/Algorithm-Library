package com.linkedlist;


public class LinkedList implements iLinkedList {

  int size = 0;
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
    Node  current =first;
    System.out.println("Data is :");
    while(current !=null )
    {
      System.out.println(current.item);
      current=current.next;
    }

  }   


  @Override
  public boolean contains(String s) {
    Node  current =first;
    boolean found=false;
    while(current !=null)
    {
      if(current.item.equals(s))
      {
        found=true;
        break;
      }
      current=current.next;
    }
  
    return found;
  }


  @Override
  public String get(int index) {
    Node current=first;
    int curerentindex=0;
    String datatoReturn=null;
    while(current !=null)
    {

      if(curerentindex== index-1)
      {
        datatoReturn=current.item;
        break;
      }
      curerentindex++;
      current=current.next;
    }  
    return datatoReturn;
  }

  
  @Override
  public String getLast() {
      return last.item;
  }

  
  @Override
  public void addLast(String f) {
    if(last == null) {
      first = new Node(null,f,null);
      last = first;
      size++;
    }else {
      
      Node newNode = new Node(last,f,null);
      last.next = newNode;
      last = newNode;
      size++;
      
      //last = new Node(last,f,null);
      //size++;
    }
  }

  @Override
  public String getFirst() {  
    return first.item;
  }


  @Override
  public String removeFirst() {
    String ElementRemoved=first.item;
    first=first.next;
    size--;
    return ElementRemoved;
  }

  @Override
  public String removeLast() {
    String ElementRemoved=null;

    if(last == null) {
    }else if(last.prev == null) {
      ElementRemoved = last.item;
      last = null;
      first = null;
      size = 0;
    }else {
      ElementRemoved = last.item;
      last = last.prev;
      last.next = null;
      --size;
    }
    return ElementRemoved;
  }

  @Override
  public void addFirst(String f) {
      Node oldFirst = first;
      Node newFirst = new Node(null,f,first);
      oldFirst.prev = newFirst;
      first.prev = newFirst;
      first =newFirst;     
      size++;

  }
  {
  //Node  newNode=new Node(null,f,oldfirst);
   //first=newNode
    //oldfirst.previous=newNode();
    //size++;
  }
  @Override
  public void add(String f) {
    Node current=first;
    if(current == null)
    {
     addFirst(f);
    }
    while(current !=null)
    {
     int result=f.compareTo(current.item);
     if(result <0)
     {
       Node newNode = new Node(current.prev,f,current); 
       current.prev.next = newNode;
       current.prev = newNode;
      
       size++;
       break;
       
     }
     else
      {
       current=current.next; 
      }
     }
    
  }


  public static void main(String[] args) {
    LinkedList listData=new LinkedList();
    System.out.println("Size of the list is :"+listData.size());
    listData.addLast("A");
    listData.addLast("B");
    //listData.addLast("C");
   listData.addLast("D");
   listData.add("C");
    /*String lastEle=listData.getLast();
    System.out.println("Last Element is "+lastEle);
    String ele=listData.get(2);
    System.out.println("Size of the list is :"+listData.size() + ele);
    listData.print();
    String firstElem=listData.getFirst();
    System.out.println("First element is " +firstElem);
    String ElemRemoved =listData.removeFirst();
    System.out.println("First Element removed is " +ElemRemoved+" And Size of the list is " + listData.size());
    
    String lastElemRemoved=listData.removeLast();
    System.out.println("Last Element removed is " +lastElemRemoved);
    //listData.print();
    listData.addFirst("Z");
    System.out.println("Size of the list now is :"+listData.size());
    System.out.println("Printing the list ");
    //listData.print();
    String Elem=listData.removeLast();
    System.out.println("Last Element removed is " +Elem);
    //listData.print();
    String Elem1=listData.removeLast();
    System.out.println("Last Element1 removed is " +Elem1);
    //listData.print();
    String Elem2=listData.removeLast();
    System.out.println("Last Element2 removed is " +Elem2);
    //listData.print();
    String Elem3=listData.removeLast();
    System.out.println("Last Element3 removed is " +Elem3);*/
    listData.print();
  }

 
}
