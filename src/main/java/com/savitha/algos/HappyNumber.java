package com.savitha.algos;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

  public static void main(String[] args) {
    int no = 2;
    boolean result = isHappyNo(no);
    if (result)
      System.out.println("True");
    else
      System.out.println("False");
  }

  private static boolean isHappyNo(int no) {
    int sum=0;
    Set<Integer> set = new HashSet<Integer>();
    while(set.add(no))
    {
      sum=0;
      while(no>0)
      {    
      
         sum += (int) Math.pow(no%10,2);
         no=no/10;
      }
      no=sum;
    }
    return no==1;
  }

}