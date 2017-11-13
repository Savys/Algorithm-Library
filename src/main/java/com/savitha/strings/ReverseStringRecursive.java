package com.savitha.strings;

public class ReverseStringRecursive {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String str = "Java";
    String reverseStr = reverseRecurive(str);
    System.out.println("Normal String is : " + str + " \nReverse String is : "+reverseStr); 
  }

  private static String reverseRecurive(String str) {
    System.out.println("Str:"+str);
    if (str.length()<=1) {
      return str;
  }
    System.out.println(str.substring(1));
    System.out.println(str.charAt(0));
   // System.out.println(str.substring(1))+str.charAt(0));
    return reverseRecurive(str.substring(1))+str.charAt(0);
  }

}
