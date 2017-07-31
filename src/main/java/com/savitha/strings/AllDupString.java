package com.savitha.strings;

import java.util.HashMap;

public class AllDupString {

  public void findDup(String input)
  {
    HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
    for (int i=0;i<input.length();i++){
      char c1=input.charAt(i);
      
      if(hm.containsKey(c1))
      {
        hm.put(c1, hm.get(c1)+1);
      }
      else
      {
        hm.put(c1,1);
      }
      for(Character c:hm.keySet()){
        if(hm.get(c)>1)
          System.out.println(c);
      }
    }
    
    
  }
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    AllDupString dup=new AllDupString();
    dup.findDup("Java");

  }

}
