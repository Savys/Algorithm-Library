package com.savitha.algos;
import java.util.Scanner;


public class StackAsarrayImplement {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);  
    System.out.println("Enter Size of Integer Stack ");
    int n = scan.nextInt();
    StackAsarray stk = new StackAsarray(n);
    stk.push(1);
    stk.push(2);
    stk.push(3);
    //stk.pop();
    //System.out.println("Popped element:"+stk.pop());
    stk.push(8);
    stk.push(7);
    stk.push(6);
    //System.out.println("Popped element:"+stk.pop());
    stk.display();
    System.out.println("Elements are :");
    
  }

}
