package com.savitha.hackerrank;
//http://cs.lmu.edu/~ray/notes/stacks/
import java.util.NoSuchElementException;

public class LinkedListImplementationofStack implements StackInterface{
  private class Node{
    public Object data;
    public Node next;
    public Node(Object data, Node next)
    {
      this.data=data;
      this.next=next;
    }
  }
  private Node top = null;
  @Override
  public void push(Object item) {
   top=new Node(item,top);
  }

  @Override
  public Object pop() {
    Object item = peek();
    top = top.next;
    
    return item;
  }

  @Override
  public Object peek() {
   if(top ==null){
    throw new NoSuchElementException();
    }
  return top.data;
  }

  @Override
  public int size() {
    int count=0;
    for(Node node=top;
        node !=null;node =node.next){
      count++;
    }
    return count;
  }

  @Override
  public boolean isEmpty() {
    return top == null;
  }
  
  public static void main(String[] args) {
    
    LinkedListImplementationofStack myStack = new LinkedListImplementationofStack();
    Integer a=10;
    String b = "Sriram";
    
    myStack.push(a);
    myStack.push(b);
    
    System.out.println(myStack.size());
    
    for(int i=0;i<myStack.size();i++) {
      Object t1 = myStack.peek();
      System.out.println(t1);
    }
  }

}
