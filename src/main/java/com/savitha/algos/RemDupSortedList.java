/*Given a sorted linked list, delete all duplicates such that each element appear only once

  Given 1->1->2, return 1->2.
  Given 1->1->2->3->3, return 1->2->3.
*/

/*
 * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

For example, given 1->1->1->2->3, return 2->3.
 * */
package com.savitha.algos;

public class RemDupSortedList {
  private Node head = null;
  int          size = 0;
   Node current=null;
   public RemDupSortedList() {
     head = null;// empty Linked List
   }
   public void append(int item) {
     if (head == null) {
       head = new Node(item);
       size++;
     } else {
       Node current = head;
       while (current.next != null) {
         current = current.next;
       }
       current.next = new Node(item);
       size++;
     }
   }
   private void printdata() {
     Node current = head;

     while (current != null) {

       System.out.print(current.data + "->");
       current = current.next;
     }

     if (current == null) {
       System.out.print("null");
     }
     System.out.println("\n");

   }
   
  public static void main(String[] args) {
    RemDupSortedList l1=new RemDupSortedList();
    l1.append(1);
    l1.append(1);
    l1.append(2);
    l1.append(3);
    l1.append(3);
    l1.removeDup();
    //l1.removeAllDupl();
    l1.printdata();

  }
  private void removeAllDupl() {
     Node prev=null;
     Node current=head;
     int x = 0;
     while(current.next!=null){
       prev=current;
       current=current.next;
       if(prev.data==current.data)
       {
         x=current.data;
       }
       removeNodewithValue(x);
     }
    
  }
  private void removeNodewithValue(int x) {
    Node prevNode=null;
    Node currentNode=head;
    if(currentNode.data==x)
    {
      head=currentNode.next;
    }
   while(currentNode.next !=null)
   {
     prevNode=currentNode;
     currentNode=currentNode.next;
     if(currentNode.data ==x){
       prevNode.next=currentNode.next;
       
     }
   }
    
  }
  private void removeDup() {
   Node prev=null;
   Node current=head;
  
   while(current.next !=null)
   {
     prev=current;
     current=current.next;
     if(current.data ==prev.data){
       prev.next=current.next;
     }
   }

  }

}
