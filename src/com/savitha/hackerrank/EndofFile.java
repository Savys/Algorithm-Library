package com.savitha.hackerrank;

import java.util.Scanner;

public class EndofFile {
 

  public static void main(String[] args) {
    String data = null;
    Scanner sc=new Scanner(System.in);
   
   
    while(sc.hasNext() && sc.equals("")){
       data=sc.nextLine();
    }
  System.out.println(data);

  }

}
