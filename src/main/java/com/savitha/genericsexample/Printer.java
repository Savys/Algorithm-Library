package com.savitha.genericsexample;

public class Printer {

  /*public <inputType> void printArray(inputType[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
    return;
  }*/
/*
  public void printArray(Integer[] intArray) {
   for(int i=0;i<intArray.length;i++)
   {
     System.out.println(intArray[i]);
   }
    
  }*/
  public <E> void printArray(E[] inputArray) {
    for  (E element:inputArray){
      System.out.println(element);
    }
   }
}
