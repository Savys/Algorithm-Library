package com.savitha.hackerrank;

import java.util.Scanner;

public class JavaStringCompare {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String strInout=sc.next();
    int subStrLen=sc.nextInt();
    String small=strInout.substring(0,subStrLen);
    String large=small;
    for(int i=1;i<strInout.length()-subStrLen+1;i++)
    {
      String current=strInout.substring(i,subStrLen);
      if(current.compareTo(small)<0)
      {
        small=current;
      }
      if(current.compareTo(large)>0){
        large=current;
      }
      
    }
    System.out.println(small);
    System.out.println(large);
  }

}

