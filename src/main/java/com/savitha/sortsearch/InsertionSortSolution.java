package com.savitha.sortsearch;

import java.util.Arrays;

public class InsertionSortSolution {
  public void insertSort(int[] input) {

    int n = input.length;
    for (int j = 1; j < n; j++) {
      int key = input[j];
      int i = j - 1;
      while ((i > -1) && (input[i] > key)) {
        input[i + 1] = input[i];
        i--;
      }
      input[i + 1] = key;
    }
  }

  private void printNumbers(int[] input) {
    System.out.println(Arrays.toString(input) + " ");
  }

  public static void main(String[] args) {
    int[] array = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
    InsertionSortSolution iSort = new InsertionSortSolution();
    iSort.insertSort(array);
    iSort.printNumbers(array);
  }

}
