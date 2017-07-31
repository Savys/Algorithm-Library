package com.savitha.hackerrank;

import java.io.IOException;

public class ExceptionHandlingExamples {

  public static void main(String[] args) {
    try{
      int data=25/0;
      System.out.println(data);
    }
    catch(ArithmeticException e)
    {
      System.out.println(e);
    }
    catch(NullPointerException e)
    {
      System.out.println(e);
    }

  }

}
