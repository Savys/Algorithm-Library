package com.savitha.datastructure;
import java.util.StringTokenizer;

public class FindWordsWithIntegers {
  public static final String delimiter = "\t";

  private String findWords(String test1) {
    StringTokenizer st = new StringTokenizer(test1, delimiter);
    StringBuilder sb = new StringBuilder();
    while (st.hasMoreElements()) {
      // System.out.println("New word is " +st.nextElement() +"\n");
      String[] arr = test1.split(delimiter);
      for (int x = 0; x < arr.length; x++) {
        System.out.println(arr[x] + ",");
      }
      /*
       * for(String ss:arr) { System.out.println(ss+ "NOW"); }
       */
      sb.append(st.nextToken());
      // System.out.println("sb is:  "+sb.toString() +",");
    }
    return null;
  }

  public static void main(String[] args) {
    String test1 = "I 1dont start 2With Integers 3All the 4Time5";
    FindWordsWithIntegers fw = new FindWordsWithIntegers();
    fw.findWords(test1);
  }
}
