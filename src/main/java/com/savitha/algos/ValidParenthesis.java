/*Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 The brackets must close in the correct order, ()"" and "()[]{}" are all valid but "(]" and "([)]" are not.*/

package com.savitha.algos;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {

  static Stack<Character> st = new Stack<Character>();

  public static void main(String args[]) {

    //String input = "()[]{}";
   // String input = "()";
   String input = "([)]";
    ValidParenthesis vp = new ValidParenthesis();
    boolean result = vp.isValid(input);
    System.out.println(result);

  }

  private boolean isValid(String input) {
    int len = input.length();
    if (!(len % 2 == 0)) {
      return false;
    }
    char[] cInput = input.toCharArray();
    for (int i = 0; i < len; i++)
    {
      char x = input.charAt(i);
      if ((x == '(')) 
      {
        st.add(x);
      } 
      else if (x == ')') 
      {
        char y = st.pop();
        if (y == '(') 
        {
          return true;
        } 
        else 
        {
          return false;
        }
      }
      
      if ((x == '[')) 
      {
        st.add(x);
      } 
      else if (x == ']') 
      {
        char y = st.pop();
        if (y == '[') 
        {
          return true;
        } 
        else 
        {
          return false;
        }
      }
      
      if ((x == '{')) 
      {
        st.add(x);
      } 
      else if (x == '}') 
      {
        char y = st.pop();
        if (y == '{') 
        {
          return true;
        } 
        else 
        {
          return false;
        }
      }
    }
    return false;
  }
}
