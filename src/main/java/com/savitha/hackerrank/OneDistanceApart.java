package com.savitha.hackerrank;

public class OneDistanceApart {

  public static void main(String[] args) {
    String s1 = "abc";
    String s2 = "abc";
    boolean retValue;
    int s1Len = s1.length();
    int s2Len = s2.length();
    if (s1Len == s2Len) {
      retValue = checkReplace(s1, s2, s1Len);
    } else {
      int len = Math.abs(s1Len - s2Len);
      if (len == 1) {
        retValue = checkaddOrDel(s1, s2, s1Len, s2Len);
      } else {
        retValue = false;
      }
    }
  }

  private static boolean checkaddOrDel(String s1, String s2, int s1Len, int s2Len) {
    String smaller = ((s1Len < s2Len) ? s1 : s2);
    String bigger = ((s1Len > s2Len) ? s2 : s1);
    int i = 0;
    int j = 0;
    boolean mismatch = false;
    while (i < s1Len && j < s2Len) {
      if (smaller.charAt(i) != bigger.charAt(j)) {
        if (mismatch) {
          return false;
        }
        mismatch = true;
        if (s1Len == s1Len) {

        }
      }
    }

    return true;
  }

  private static boolean checkReplace(String s1, String s2, int strLen) {
    int diff = 0;
    for (int i = 0; i < strLen; i++) {
      if (s1.charAt(i) != s2.charAt(i)) {
        diff++;
      }
    }
    if (diff > 1) {
      return false;
    }
    return true;
  }
}
