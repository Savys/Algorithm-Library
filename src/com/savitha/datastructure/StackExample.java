package com.savitha.datastructure;
//Implement Stack as an array
public class StackExample {
  private int maxsize;
  private long[] stackArray;
  private int top;
  public StackExample(int s)
  {
    maxsize=s;
    stackArray=new long[maxsize];
    top=-1;
     
  }
  public void push(long ele){
    stackArray[++top]=ele;
  }
  public long pop()
  {
    return stackArray[top--];
  }
  public boolean isEmpty()
  {
    return (top ==-1);
  }
  public boolean isFull(){
    return (top == maxsize-1);
  }
  public static void main(String[] args) {
    StackExample myStackExample =new StackExample(10);
    myStackExample.push(10);
    myStackExample.push(20);
    myStackExample.push(30);
    while(!myStackExample.isEmpty())
    {
      long value=myStackExample.pop();
      System.out.println(value);
    }
     

  }

}
