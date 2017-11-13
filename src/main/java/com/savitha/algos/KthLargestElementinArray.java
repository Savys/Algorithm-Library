package com.savitha.algos;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElementinArray {
  public static int findlargest1(int[] inputArray,int x)
  {
    int result=0;
    Arrays.sort(inputArray);
    int len=inputArray.length;
    int pos=len-x;
    result=inputArray[pos];
    return result;
  }
  public static int findlargest2(int[] nums,int k)
  {
    PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
    for(int i: nums){
        q.offer(i);
        System.out.println("q.offer: "+i);
 
        if(q.size()>k){
            int no=q.poll();
            System.out.println("q.poll: "+no);
        }
    }
 
    return q.peek();
  }
  public static void main(String[] args) {
    int[] input={3,2,1,5,6,4} ;
   // int[] input={7,6,5,8,10,9} ;
    int k=2;
    int result=findlargest1(input,k);
    //System.out.println(result);
    int result2=findlargest2(input,k);
    System.out.println(result2);
  }

}
