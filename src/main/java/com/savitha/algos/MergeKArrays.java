/*
 * 
 This problem can be solved by using a heap. The time is O(nlog(n)).

Given m arrays, the minimum elements of all arrays can form a heap. It takes O(log(m)) to insert an element to the heap and it takes O(1) to delete the minimum element.

 * */
package com.savitha.algos;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MergeKArrays {

  public static int[] mergeKSortedArrays(int[][]arr)
  {
   PriorityQueue<ArrayHolderObj>queue=new PriorityQueue<ArrayHolderObj>();
   int total=0;
   for(int i=0;i<arr.length;i++)
   {
     queue.add(new ArrayHolderObj(arr[i],0));
     total=total+arr[i].length;
   }
   int m=0;
   int result[]=new int[total];
   while(!queue.isEmpty())
   {
     ArrayHolderObj obj=queue.poll() ;
     result[m++]=obj.arr[obj.index];
     //System.out.println("obj.index outside:"+obj.index);
     
     if(obj.index<obj.arr.length-1)
     { 
       //System.out.println("obj.index inside:"+obj.index);
       //System.out.println("******************************");
       queue.add(new ArrayHolderObj(obj.arr,obj.index+1));
     }
   }
   return result;
   }
  public static void main(String[] args) {
    int[] arr1 = { 1, 3, 5, 7 };
    int[] arr2 = { 2, 4, 6, 8 };
    int[] arr3 = { 0, 9, 10, 11 };
 
    int[] result = mergeKSortedArrays(new int[][] { arr1, arr2, arr3 });
    System.out.println(Arrays.toString(result));

  }

}
