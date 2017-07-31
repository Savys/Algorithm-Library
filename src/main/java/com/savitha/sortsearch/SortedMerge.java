package com.savitha.sortsearch;

import java.util.ArrayList;
import java.util.List;

/*
 * Given 2 sorted arrays A and B, A has large buffer to hold B.Merge B into A in sorted order.
 * Soln implemented - Add all the values to one array and use Insertion sort to sort.Alternative approaches needs to be  tried. 
 * */
public class SortedMerge {

  private static List<Integer> SortList(List<Integer> arrayListA) {
    System.out.println("Sorted arrayListA:\n");
    System.out.println(arrayListA);
    return arrayListA;
  }

  private static void sort(List<Integer> arr) {
    int val;
    int holePos;
    for (int k = 1; k < arr.size(); k++) {
      val = arr.get(k);
      holePos = k;
      while (holePos > 0 && arr.get(holePos - 1) > val) {
        arr.set(holePos, arr.get(holePos - 1));
        holePos--;
      }
      arr.set(holePos, val);
    }
  }

  public static void main(String[] args) {
    int A[] = { 1, 3, 5, 7, 9 };
    int B[] = { 2, 4, 6, 8, 10 };

    List<Integer> arrayListA = new ArrayList<Integer>();
    arrayListA.add(1);
    arrayListA.add(3);
    arrayListA.add(5);
    arrayListA.add(7);
    arrayListA.add(9);
    List<Integer> arrayListB = new ArrayList<Integer>();
    arrayListB.add(2);
    arrayListB.add(4);
    arrayListB.add(6);
    arrayListB.add(8);
    arrayListB.add(10);
    int arrayListSize = arrayListA.size();
    //System.out.println("\n");
    int arrayListSizeB = arrayListB.size();
    for (int i = 0; i < arrayListSizeB; i++) {
      arrayListA.add(arrayListB.get(i));
    }
    // System.out.println("Array List Merge1: \n");
    int arrayListSizeM = arrayListA.size();
    for (int i = 0; i < arrayListSizeM; i++) {
      // System.out.println(arrayListA.get(i));
    }
    // SortList(arrayListA);
    sort(arrayListA);
    System.out.println("The sorted values are:");
    for (int i = 0; i < arrayListSizeM; i++) {
      System.out.println(arrayListA.get(i));
    }
  }

}
