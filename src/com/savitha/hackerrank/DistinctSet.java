package com.savitha.hackerrank;

import java.util.HashSet;
import java.util.Set;

public class DistinctSet {

  public static void main(String[] args) {
    Integer[] input = { 8, 16, 8, 5, 8, 1, 5, 9, 9, 100 };
    Set<Integer> setA = new HashSet<Integer>();
    for (int i = 0; i < input.length; i++) {
      setA.add(input[i]);
    }
    System.out.println("The number of distinct elements are:" + setA.size());
  }

}
