package com.savitha.datastructure;
public class compressionTest {
  /*
   * Implement a method to perform basic string compression using the counts of
   * repeated characters. For example, the string aabcccccaaa would become
   * a2blc5a3. If the "compressed" string would not become smaller than the
   * original string, your method should return the original string. You can
   * assume the string has only uppercase and lowercase letters (a - z).
   */
  public static String compressionTest(String input) {

    if ((input == null) || input.isEmpty()) {
      return input;
    }

    int count = 1;

    StringBuilder result = new StringBuilder();
    char prev = input.charAt(0);
    result.append(prev);
    
    for (int i = 1; i < input.length(); i++) {
      char curr = input.charAt(i);
      if (curr == prev) {
        ++count;

      } else {
        prev = curr;
        result.append(count).append(prev);
        count = 1;
      }
    }
    result.append(count);
    return result.toString().length()>=input.length()?input:result.toString();
  }

  public static void main(String[] args) {
    //String result = compressionTest("a");
    String result=compressionTest("aabcccccaaa");
    System.out.println(result);
  }

  
}
