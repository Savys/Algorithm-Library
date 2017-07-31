package com.savitha.hackerrank;

import java.util.Scanner;

public class FindFactors {

  public static void main(String[] args) {
    int result=0;int sum=0;
    Scanner readScanner=new Scanner(System.in);
   int num=readScanner.nextInt();
    
    for (int i=1;i<=num;i++)
    {
      if(num%i ==0 )
      {
         sum=sum+i;
      }
    }  
    System.out.print("Sum:"+sum);

  }

}
