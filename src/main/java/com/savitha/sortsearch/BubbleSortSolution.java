package com.savitha.sortsearch;

import java.util.Arrays;

public class BubbleSortSolution {

  public void bubbleSort(int[] input) {
    int temp;
    for (int i = 0; i < input.length; i++) {
      for (int j = 1; j < input.length - 1; j++) {
        if (input[j - 1] > input[j]) {
          temp = input[j - 1];
          input[j - 1] = input[j];
          input[j] = temp;
        }
      }
    }
  }

  public void printarray(int[] input) {

    System.out.println(Arrays.toString(input));
  }

  public static void main(String[] args) {
    int[] arr = { 5, 6, 1, 0, 3, 10, 4, 9, 2 };
    BubbleSortSolution bs = new BubbleSortSolution();
    bs.bubbleSort(arr);
    bs.printarray(arr);
  }

}
