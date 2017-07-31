package com.savitha.algos;

public class SingleArrayAsStack {
  private int top;
  int size;
  //int len=0;
  int[]arr;

  public SingleArrayAsStack(int ArraySize)
  {
    size=ArraySize;
    arr=new int[size];
    top =-1;
  }
  public boolean isEmpty()
  {
    return top ==-1;
  }
  public boolean isFull()
  {
    return (top)== size-1;
  }
  public void push()
  {
  }
  public int getTop()
  {

    return top;
  }

  public int setOuterBoundary(int top)
  {
    int boundary=-1;
    int array1Boundary=4;
    int array2Boundary=8;
    if (top<=array1Boundary){
      if (boundary==array1Boundary) {}
    }
    else
    {
      boundary=array2Boundary;
    }
    return boundary;  
  }
  public void push(int i)
  {

    /* if top;.hh.. ,/ \]l'oki,, ml[,]\0' */
  }
}
