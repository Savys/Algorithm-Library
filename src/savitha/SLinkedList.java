package savitha;

public class SLinkedList {
  NodeforSLL head = null;

  public void append(int data) {
    NodeforSLL current = head;
    if (head == null) {
      head = new NodeforSLL(data);
      return;
    }
    while (current.next != null) {
      current = current.next;
    }
    current.next = new NodeforSLL(data);
  }

  public void prepend(int data) {
    NodeforSLL newhead = new NodeforSLL(data);
    newhead.next = head;
    head = newhead;
  }

  public void deleteWithValue(int data) {
    NodeforSLL current = head;
    while (current.next != null) {
      if (current.next.data == data) {
        current.next = current.next.next;
      } else {
        current = current.next;
      }
      ;
    }
  }

  public int FetchNode(int pos) {
    NodeforSLL current = head;
    int counter = 1;
    // if it is an empty node return
    if (getSize() == 0) {
      System.out.println("Empty List!");
      return -1;
    }
    while (current.next != null) {
      if (pos == counter) {
        return current.data;
      } else {
        counter++;
        current=current.next;
      }
    }
    return -1;
  }
  public int FetchNodefromReverse(int pos)
  {
    NodeforSLL current = head;
    int counter = 1;
    int index=0;
    int result=0;
    // if it is an empty node return
   int size=0;
   size=getSize();
    if (size == 0) {
      System.out.println("Empty List!");
      return -1;
    }
    else{
      
      index=size-pos+1;
      result=FetchNode(index);
      
    }
    return result;
  }
  public int getSize()
  {
    int count=0;
    NodeforSLL current=head;
    while(current !=null)
    {
      count++;
      current=current.next;
    }
    System.out.println("Count: "+count);
    return count;
    
  }

  public void printNode() {
    NodeforSLL current = head;
    while (current != null) {
      System.out.println(current.data);
      current = current.next;
    }
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    SLinkedList linked = new SLinkedList();
    linked.append(10);
    linked.append(20);
    linked.append(30);
    linked.append(40);
    linked.append(50);
    linked.append(60);
    linked.append(70);
    linked.append(80);
    linked.printNode();
    //linked.deleteWithValue(2);
    //System.out.println("After deletion:");
    //linked.printNode();
    int size=linked.getSize();
    System.out.println("size:"+size);
   int result=linked.FetchNode(3);
   System.out.println("Node at position is :"+result);
   int result2=linked.FetchNodefromReverse(3);
   System.out.println("Node from last  :"+result2);
  }

}
