package com.savitha.algos;

public class OddEvenSolution {

  protected ListNode head;
  public int         size;

  public void oddEvenList(int no) {
    ListNode current = head;
    ListNode prev = null;
    ListNode save = null;
    int cnt=0;
    
    while (current != null) 
    {
      if (current.data % 2 == 0) 
      { 
        save=current;
        insertlast(current.data);
        if(prev!=null)
        {
          prev.next=save.next;
        }
        else{
          prev=save;
        }  
        prev=current;
        current = save.next;
      } else 
      {  prev=current;
        current = current.next;
      }
      cnt++;
      if((current.next ==null)||(cnt ==no-1)){
        break;}
    }
  }

  // constructor
  public OddEvenSolution() {
    this.head = null;
    this.size = 1;
  }

  public boolean isEmpty() {
    return head == null;
  }

  public int getSize() {
    return size;
  }

  public void push(int data) {

    ListNode current = head;
    if (head == null) {
      head = new ListNode(data);
      return;
    }
    while (current.next != null) {
      current = current.next;
    }
    current.next = new ListNode(data);
    size++;
  }

  public void insertlast(int data) {

    ListNode last = head;
    ListNode new_node = new ListNode(data);
    if (head == null)
    {
        head = new ListNode(data);
        return;
    }new_node.next=null;
    while(last.next !=null)
      last=last.next;
    last.next = new_node;
    size++;
  }

  public void printList() {
    ListNode temp = head;
    while (temp != null) {
      System.out.print((temp.data) + " ");
      temp = temp.next;
    }
    if (temp == null) {
      System.out.println("null");
    }

  }

  public static void main(String[] args) {
    OddEvenSolution llist = new OddEvenSolution();
    llist.push(1);
    llist.push(2);
    llist.push(3);
    llist.push(4);
    llist.push(5);
    llist.push(6);
    llist.push(7);
    int n=llist.getSize();

    System.out.println("Origional Linked List");
    llist.printList();

    llist.oddEvenList(n);
    // llist.insertlast(10);
    System.out.println("Modified Linked List");
    llist.printList();
  }

}
