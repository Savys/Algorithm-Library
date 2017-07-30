package com.savitha.hackerrank;

import java.util.Scanner;

class SolveMeFirst {

  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int a;
    a=(in.nextInt());
    /*if (a ==)
    {
      System.out.println("Please specify a value for a");
    }*/
    int b;
    b=in.nextInt();
    int sum;
    sum=Add(a,b);
    System.out.println(sum);
  }

  private static int Add(int a, int b) {
    return a+b;
  }

}
