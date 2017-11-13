/*Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

For example, given [100, 4, 200, 1, 3, 2], the longest consecutive elements sequence should be [1, 2, 3, 4]. Its length is 4.*/

package com.savitha.algos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class LongestConsecutiveSequence {
  static int count = 0;

  private static void findlen(int[] input) {
    int[] newArray = new int[input.length + 1];
    PriorityQueue<Integer> myqueue = new PriorityQueue<Integer>();
    for (int f : input) {
      myqueue.add(f);
    }

    for (int z = 0; z < input.length; z++) {
      int g = myqueue.poll();
      // System.out.println(g);
      newArray[z] = g;
    }

    for (int p = 0; p < newArray.length - 1; p++) {
      // System.out.println("newArray[p]  :"+newArray[p]+
      // "  "+"newArray[p+1]  :"+newArray[p+1]);
      int y = newArray[p + 1];
      if (y == newArray[p] + 1) {
        count++;

      }
    }
    System.out.println(count + 1);
  }

  public static void main(String[] args) {
    int[] input = { 100, 4, 200, 1, 3 };
    findlen(input);
  }

}
