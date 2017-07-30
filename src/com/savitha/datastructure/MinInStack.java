package com.savitha.datastructure;
import java.util.NoSuchElementException;

public class MinInStack {
  int         size;
  int         len = 0;
  int[]       arr;
  private int top;

  public MinInStack(int arraySize) {
    size = arraySize;
    arr = new int[size];
    top = -1;
  }

  public void push(int ele) {

    //if(top+1>size) thro
    if (top + 1 <= size) 
      {
        top++;
        arr[top] = ele;
        len++;
      }
  }
  public int  pop(){
    if(isEmpty()) throw new NoSuchElementException("Stack underflow ");
   return 1; 
  }

  private boolean isEmpty() {  
    return top==-1;
  }
  /*
   * int pop(void)
{
    assert(top>0);
    return data[--top];
}
int peek(void)
{
    assert(top>0);
    return data[top-1];
}*/
  
  
   */
  //27,59,78
}
