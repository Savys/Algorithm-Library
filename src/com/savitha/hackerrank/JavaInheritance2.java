package com.savitha.hackerrank;

public class JavaInheritance2 {
  public static void main(String[] args) {
    Adder X=new Adder();
    System.out.println("My super class is:"+X.getClass().getSuperclass().getName());
    System.out.print(X.add(10, 32) +" " + X.add(10, 3) + " " + X.add(10,10));

  }

}
