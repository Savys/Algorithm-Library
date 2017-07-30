package com.savitha.hackerrank;
//Object String("a") does not change to String("ty"), it gets discarded, and a reference to ty gets written into a in its stead.
public class ImmutableString {

  public static void main(String[] args) {
       testMethod();

  }

  private static void testMethod() {
    String a ="a";
    System.out.println("a 1 ->" +a);
    String b=a;
    a="ty";
    
    System.out.println("a 2 ->" +a);
    System.out.println("b ->" +b);
    
  }
  

}
