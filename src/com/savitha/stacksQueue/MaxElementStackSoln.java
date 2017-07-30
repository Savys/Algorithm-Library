package com.savitha.stacksQueue;

import java.util.Scanner;
import java.util.Stack;

public class MaxElementStackSoln {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter no of steps you want to proceed with :");
    int numElements = in.nextInt();
    int top = 0;
    Stack st = new Stack();
    int maxE = 0;

    for (int i = 0; i < numElements; i++) {
      System.out.println("Enter your choice:");
      switch (in.nextInt()) {
      case 1:
        System.out.println("Enter the element to be pushed into the stack:");
        int ele = in.nextInt();
        st.push(ele);
        if (top == -1) {
          top = 1;
        } else {
          top++;
        }
        System.out.println("Stack size in push:" + top);
        break;
      case 2:
        if (top > 0) {
          int pEle = (int) st.pop();

          top--;

          if (pEle > maxE) {
            maxE = pEle;
          }
        }
        System.out.println("Stack size:" + top);
        break;
      case 3:
        if (top == 0) {
          System.out.println(maxE);
        } else {

          while (top != 0) {
           //System.out.println("Stack size inside max:" + top);
            int value = (int) st.pop();
            if (value > maxE) {
              maxE = value;

            }
            top--;
          }
          System.out.println(maxE);
        }
      }
    }
  }

}