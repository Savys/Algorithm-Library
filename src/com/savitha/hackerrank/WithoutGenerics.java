package com.savitha.hackerrank;

import java.util.ArrayList;

public class WithoutGenerics {

  public static void main(String[] args) {
    ArrayList marksList=init();
    ArrayList resultList=add(marksList,5);

  }

  public static ArrayList add(ArrayList marksList, int i) {
    ArrayList resultList=new ArrayList();
    for(Object mark :marksList){
      int newMark=((Integer) mark).intValue();
      resultList.add(new Integer(newMark));
      
    }
    
    return resultList;
  }

  public static ArrayList init() {
    ArrayList markList=new ArrayList();
    markList.add(new Integer(94));
    markList.add(new String("Hundred"));
    markList.add(new Integer(90));
    
    return markList;
  }

}
