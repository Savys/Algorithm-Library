package savitha;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HighestOccurance {
  public void FindHighestOccurnce( String input )
  {
    char result;
    HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
    for (int i=0;i<input.length();i++)
    {
      char c=input.charAt(i);
      if(hm.containsKey(c))
      {
        hm.put(c,hm.get(c)+1);
      }
      else{
        hm.put(c,1);
      }
     }
    //int maxValueinMap=(Collections.max(hm.values));
    for(Character key:hm.keySet())
    {
        System.out.println(key+" : "+hm.get(key));
    }
    Map.Entry<Character, Integer> maxEntry=null;
    for(Map.Entry<Character, Integer> entry:hm.entrySet())
    {
      if(maxEntry == null || entry.getValue().compareTo(maxEntry.getValue())>0)
      {
        maxEntry=entry;
      }      
    }
    System.out.println("Max Value:"+maxEntry);
    //return maxentry; //how to return maxEntry
  }

  public static void main(String[] args) {
    /*ou need to write a function to implement an algorithm which will accept a string of characters and 
     * should find the highest occurrence of the character and display it. 
     * For example if input is "aaaaaaaaaaaaaaaaabbbbcddddeeeeee" it should return "a".
     */

    HighestOccurance ho=new HighestOccurance();
    ho.FindHighestOccurnce("aaaaaaaaaaaaaaaaabbbbcddddeeeeee");
    
  }

}
