package com.savitha.hackerrank;

public class SubstringTest {

  public static void main(String[] args) {
    String str="Savitha Srinivasan";
    StringBuilder builder=new StringBuilder(str);
    String sr=builder.substring(3, 7);
    System.out.println(sr);
    int r1=str.indexOf(sr);
    
    int r2=str.indexOf("vit");
    System.out.println(r1);
    System.out.println(r2);

  }

}
