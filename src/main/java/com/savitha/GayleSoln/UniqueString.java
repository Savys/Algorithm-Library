package com.savitha.GayleSoln;

public class UniqueString {
  
  
  public void isUnique(String input) {
    char toCompare;
    Boolean dup=false;
    System.out.println("Input:" + input);
    for (int i = 0; i < input.length() ; i++) {
      toCompare = input.charAt(i);
      System.out.println("tocompare: "+toCompare);
      for (int j = 0; j < input.length() ; j++) {
        if(i==j) {
          continue;
        }
        System.out.println("input char at j:"+input.charAt(j));
        if (toCompare == input.charAt(j)) {
          System.out.println("Not Unique characters");
          dup=true;
          break;
        }
      }
      if(dup) 
        break;
    }
    if(!dup) {
      System.out.println("Unique characters");
    }
  }
}

/*
 * for (int i = 0; i < len ; i++) {
      toCompare = input.charAt(i);
      System.out.println("tocompare: "+toCompare);
      for (int j = 1; j < len ; j++) {
        System.out.println("input char at j:"+input.charAt(j));
        if (toCompare == input.charAt(j)) {
          System.out.println("Not Unique characters");
          break;
        } else {
          j++;
        }
      }
      i++;
    }System.out.println("Unique characters");
  }

 * */
 