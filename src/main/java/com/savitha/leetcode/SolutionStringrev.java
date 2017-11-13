package com.savitha.leetcode;

public class SolutionStringrev {
  public String reverseString(String s) {
    int len=s.length();
    System.out.println(len);
    char[] input=s.toCharArray();
    StringBuilder sb=new StringBuilder();
    sb.append(s);
    sb=sb.reverse();
    return sb.toString();
    
  }

  public static void main(String[] args) {
    SolutionStringrev obj= new SolutionStringrev();
    String s="Hello";
    String revStr=obj.reverseString(s);
    System.out.println(revStr);
    
    
  }

}
