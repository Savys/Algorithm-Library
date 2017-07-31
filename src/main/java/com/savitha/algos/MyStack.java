package com.savitha.algos;


//INCOMPLETE
public class MyStack<T> {
  private static class StackNode<T>{
    private T data;
    private StackNode<T> next;
    
    public StackNode(T data)
    {
      this.data=data;
    }
    private StackNode<T>top;
    
    public T pop()
    {
      
      return data;
      
    }
    public void push(T item)
    {
      
    }
    public T peek()
    {
      return data;
    }
    
  }

}
