package com.savitha.algos;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class SplitString {

  public static void main(String[] args) {
    String delimiter="\t";
    String test1= "I dont1 start 2With Integers 3All the Time5 And then6";
    /*Method 1*/
    String[] arr = test1.split(".");  
    for (int x=0; x<arr.length; x++) {
      //System.out.println(arr[x]+",");
    }
    /*Method 2*/
    String word_list[] = test1.split(" +");
    List<String> intword_list = new ArrayList<String>();
    for(int y=0;y<word_list.length;y++)
    {
      String word = word_list[y];
      if(
          (word.charAt(0) >= '0' && word.charAt(0) <= '9') ||
          (word.charAt(word.length()-1) >= '0' && word.charAt(word.length()-1) <= '9')
          ) {
        intword_list.add(word);
      }
    }
    
    for(int i=0;i<intword_list.size();i++) {
      System.out.println(intword_list.get(i));
    }
   // System.out.println(word_list[2]);
     
  }

}
