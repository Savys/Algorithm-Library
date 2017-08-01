package com.savitha.algos;

import java.util.Scanner;

public class Java1dArraySolution {

  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
     * class should be named Solution.
     */
    int count = 0;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    for (int j = 0; j < n; j++) {
      int sum = 0;

      for (int k = j; k < n; k++) {
        sum = sum + a[k];
          if (sum > 0) {
          count++;
        }
      }
    }
    System.out.println("Count: " + count);
  }

}
