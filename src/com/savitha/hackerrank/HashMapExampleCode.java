package com.savitha.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class HashMapExampleCode {

  public void sample() {
HashMap<Integer, String> hmap = new HashMap<Integer, String>();
hmap.put(12, "Chaitanya");
hmap.put(2, "Rahul");


Set set=hmap.entrySet();
Iterator iterator=set.iterator();

while(iterator.hasNext())
{
      Map.Entry mentry=(Map.Entry)iterator.next(); 
      System.out.print("key is "+mentry.getKey());
      System.out.println(mentry.getValue());
}
  }


}
