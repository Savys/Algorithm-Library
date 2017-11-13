package com.savitha.algos;

public class ArrayHolderObj implements Comparable<ArrayHolderObj>{
int[] arr;
int index;

public ArrayHolderObj(int[] arr,int index) {
  this.arr=arr;
  this.index=index;
  
}
  
  public int compareTo(ArrayHolderObj o) {
       return this.arr[this.index]-o.arr[o.index];
  }

}
