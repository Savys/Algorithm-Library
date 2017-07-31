package com.savitha.hackerrank;

import java.util.Scanner;

public class StringTest {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    String B = sc.next();
    int compareResult=0;
    int sum=0;
    int result = length(A);
    int result2 = length(B);
    sum=result+result2;
    System.out.println(sum);
    compareResult=A.compareTo(B);
    if (compareResult <0)
      System.out.println("NO");
    else
      if (compareResult>0)
        System.out.println("YES");
   String joinedStr=A + " " +B;
   System.out.println(joinedStr);
   //WordsUtils.capitalize(str);
   //String output = joinedStr.substring(0, 1).toUpperCase() + input.substring(1);
     
        



  }

  private static int length(String a) {
    int len = 0;
    try {
      while (true) {
        a.charAt(len);
        len++;
      }
    } catch (Exception e) {
      //Out of bounds exception
    }
    return len;
  }

}
