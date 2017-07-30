package com.savitha.hackerrank;

public class substringIndex {
  
  private static int myIndexOf2(String source, String target) {
    int result = -1;

    int len=target.length();
    for(int i=0;i<source.length();i++)
    {
      StringBuilder word=new StringBuilder();
      for (int k=i;k<i+len && k<=source.length();k++)
      {
        word.append(source.charAt(k));
        if(source.charAt(k) != word.charAt(k)) {
          
        }
      }
      if(word.toString().equals(target))
      {
        result = i;
        break;
      }
    }
    return result;
  }

  private static int myIndexOf(String source, String target) {
    int result = -1;

    int len=target.length();
    for(int i=0;i<source.length();i++)
    {
      StringBuilder word=new StringBuilder();
      for (int k=i;k<i+len && k<=source.length();k++)
      {
        word.append(source.charAt(k));
      }
      if(word.toString().equals(target))
      {
        result = i;
        break;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    String input="California";
    String subinput="ni";

    Boolean flag=false;
    int idx=-1;
    long startTime = System.nanoTime();
    idx = myIndexOf2(input,subinput);
    long stopTime = System.nanoTime();

    long elapsedTime = stopTime - startTime;
    long startTime2 = System.nanoTime();
    int pos=input.indexOf(subinput);
    long stopTime2 = System.nanoTime();
    
    System.out.println("result="+idx+",java:"+pos);
    
    long elapsedTime2 = stopTime2 - startTime2;
    System.out.println("Custom:"+elapsedTime);
    System.out.println("Java:"+elapsedTime2);
  }


}