package com.savitha.hackerrank;

import java.util.Scanner;

public class ReverseArray {

  public static void main(String[] args) {
    Scanner newscanner =new Scanner(System.in);
    String name=newscanner.nextLine();
    
    String reverseString=new StringBuffer(name).reverse().toString();
    System.out.print(reverseString); //Hello World -->dlroW olleH
     FnReverseString(name);
    
  }

    static String FnReverseString(String name) {
    StringBuilder strBuilder=new StringBuilder();
    char[] charStr=name.toCharArray();
    
    for(int i=charStr.length-1;i>=0;i--){
      strBuilder.append(charStr[i]);
    }
    return strBuilder.toString();
    }
}
