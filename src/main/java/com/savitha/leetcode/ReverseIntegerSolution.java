package com.savitha.leetcode;

public class ReverseIntegerSolution {

  public int reverse(int x) {
    long result = 0;
    boolean flag = false;
    int rem;
    if (x < 0) {
      x = 0 - x;
      flag = true;
    }
    while (x > 0) {
      rem = x % 10;
      x = x / 10;
      result = result * 10 + rem;
    }
    if (flag) {
      result = 0 - result;
    }
    return result > Integer.MAX_VALUE || result < Integer.MIN_VALUE ? 0 : (int) result;

  }

  public static void main(String[] args) {
    ReverseIntegerSolution rev=new ReverseIntegerSolution();
    int res=rev.reverse(-123);
    System.out.println(res);
  }
}
