package com.savitha.hackerrank;

public class EqualsTest {

  public static void main(String[] args) {
    String obj1 = new String("xyz");
    String obj2 = new String("xyz");
    if(obj1 == obj2)
      System.out.println("obj1==obj2 is TRUE");
   else
     System.out.println("obj1==obj2 is FALSE"); //== checks if they point to the same place in memory.
    
    
     obj2 = obj1;

    if(obj1 == obj2)
       System.out.print("obj1==obj2 is TRUE");
    else
      System.out.println("obj1==obj2 is FALSE");

  }

}
