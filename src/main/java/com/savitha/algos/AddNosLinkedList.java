package com.savitha.algos;

/*
 You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order 
 and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 */
/*This class uses Node.java*/

public class AddNosLinkedList {
  private Node head = null;
  int          size = 0;

  public AddNosLinkedList() {
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

  private String formNumber(AddNosLinkedList listdata) {
    Node current = head;
    StringBuilder sb = new StringBuilder();

    while (current != null) {
      sb.append(current.data);
      current = current.next;
    }
    System.out.println("String Number listdata:" + sb.toString());
    return sb.toString();
  }

  private static void add(String no1, String no2, AddNosLinkedList l3) {
    int input1 = Integer.parseInt(no1);
    int input2 = Integer.parseInt(no2);

    int result = input1 + input2;
    int revResult = reverseResult(result);
    // System.out.println(revResult);
    InsertIntoLinkedList(revResult, l3);
  }

  private static void InsertIntoLinkedList(int data, AddNosLinkedList l3) {
    System.out.println(data);
    while (data > 0) {
      int digit = (data % 10);
      l3.append(digit);
      data = data / 10;
    }
    l3.printdata();

  }

  private static int reverseResult(int n) {
    int reverse = 0;
    while (n != 0) {
      reverse = reverse * 10;
      reverse = reverse + n % 10;
      n = n / 10;
    }

    return reverse;
  }

  public static void main(String[] args) {
    AddNosLinkedList l1 = new AddNosLinkedList();

    l1.append(2);
    l1.append(4);
    l1.append(3);
    l1.printdata();
    AddNosLinkedList l2 = new AddNosLinkedList();
    l2.append(5);
    l2.append(6);
    l2.append(4);
    l2.printdata();
    String no1 = l1.formNumber(l1);
    String no2 = l2.formNumber(l2);
    AddNosLinkedList l3 = new AddNosLinkedList();

    add(no1, no2, l3);
  }

}
