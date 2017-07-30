package com.savitha.datastructure;
public class BinarySearchAlgo {
  private int searchEle(int[] input, int i) {
    int start = 0;
    int end = input.length - 1;
    // int mid=(start+end)/2;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (input[mid] == i) {
        return mid + 1;
      } else {
        if (i < input[mid]) {
          end = mid;
        } else {
          start = mid + 1;
        }
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    BinarySearchAlgo bs = new BinarySearchAlgo();
    int input[] = { 5, 10, 15, 20, 25, 30 };
    int result = bs.searchEle(input, 20);
    System.out.println(result);
  }

}
