package com.savitha.hackerrank;

import java.util.Scanner;

public class ExceptionHandling {
  public static void main(String []arg)
  {
      Scanner in = new Scanner(System.in);

      while(in.hasNextInt())
      {
          int n = in.nextInt();
          int p = in.nextInt();
          mynewCalculator M = new mynewCalculator();
          try
          {
              System.out.println(M.power(n,p));
          }
          catch(Exception e)
          {
              System.out.println("Exception is :"+e);
          }
      }

  }

}
