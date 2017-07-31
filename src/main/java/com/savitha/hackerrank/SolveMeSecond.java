package com.savitha.hackerrank;

import java.util.Scanner;

public class SolveMeSecond {

  public static void main(String[] args) {
    Scanner inVariable=new Scanner(System.in);
    int sum=0;
    int NoOflines=inVariable.nextInt();
    System.out.println(NoOflines);
    for (int i=1;i<=NoOflines;i++)
    {
      int a;
      int b;
      a=inVariable.nextInt();
      b=inVariable.nextInt();
      sum=CalculateSum(a,b);
      System.out.println("Sum of the values:\n"+sum) ;
    }
    
  }

  private static  int CalculateSum(int a, int b) {
    int result=a+b;
    return result;
  }
}
