package com.savitha.hackerrank;

import java.util.Scanner;

public class SimpleArraySum {

  public static void main(String[] args) {
    int NoOfValues=0,i;
    int sum=0;
    int ArrayValue;
    Scanner inScanner=new Scanner(System.in);
    NoOfValues= inScanner.nextInt();
    for(i=0;i<NoOfValues;i++)
    {
      ArrayValue=inScanner.nextInt();
      
      sum=sum+ArrayValue;
    }
    System.out.println(sum);
    
    
    
    
   

  }

}
