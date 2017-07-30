package com.savitha.datastructure;

public class StackAsarray {

  private int top;

  int size;
  int len=0;
  int[]arr;


  public StackAsarray(int arraySize)
  {
    size=arraySize;
    arr=new int[size];
    top=-1;    
  }
  public boolean isEmpty()
  {
    return top==-1;
  }
  public  boolean isFull()
  {
    return top==size-1;
  }
  public int getSize()
  {
    return len;
  }
  public int peek()
  {//27
    /*if( isEmpty() )
            throw new NoSuchElementException("Underflow Exception");*/
    return arr[top];
  }

  public void push(int i)
  {
   /* if top+1<size throw overflow exception*/
    if(top + 1 <= size ){
      ++top;
      arr[top]=i;
      len++;
    }
  }
  public int pop()
  {
    /*if( isEmpty() )
    throw new NoSuchElementException("Underflow Exception");*/
    len--;
    return arr[top--];
  }
  
  public void display()
  {
    if (len ==0)
    {
      System.out.println("Empty display");
      return;
    }
    for(int i=top;i>=0;i--)
    {
      System.out.println("elements are :"+arr[i]);
    }
  }
  
  
}
