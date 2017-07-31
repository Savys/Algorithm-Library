package com.savitha.stacksQueue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no of elements and no of rotations:");
      int n=sc.nextInt();
      // System.out.println("Enter the no of left rotations performed:");
      int rot=sc.nextInt();
      int origarray[]=new int[n];
      int newarray[]=new int[rot];
      Queue<Integer> q = new LinkedList<>();
      System.out.println("Enter the elements:");
      for(int i=0;i<n;i++){
        origarray[i]=sc.nextInt();
      }
  
  
      for(int k=rot;k<n;k++)
      {
        q.add(origarray[k]);
      } 
  
      for(int j=0;j<rot;j++)
      {
        q.add(origarray[j]);
        
      }
      System.out.println("Elements of the queue before are: " +q);
      
      Iterator<Integer> iter = q.iterator();
      while (iter.hasNext()) {
        Integer current = iter.next();
        }
      for(Object item : q){
        System.out.print(item);
      } 
    }
}
