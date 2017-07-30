package savitha;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HackerRankHash {

  private Map<String, Integer> screen = new HashMap<String,Integer>();

  public  void printMap() {
    Iterator it = screen.entrySet().iterator();
    while (it.hasNext()) {
      Map.Entry pair = (Map.Entry)it.next();
      System.out.println(pair.getKey() + " = " + pair.getValue());
      it.remove(); // avoids a ConcurrentModificationException
    }
  }  

  public int processCommand(String wordCommand) {
    int score =0;

    Boolean isCommandAdd = false;
    if(wordCommand.charAt(0)=='+') {
      isCommandAdd = true;
    }
    //+race becomes race
    String word = wordCommand.substring(1);
    System.out.println("word:"+wordCommand);

    for(int i=0;i<word.length();i++) {
      String current = word.substring(0,i+1);
      //System.out.println("current:"+current);

      Integer currentCount = 0;
      //check if its in the hashmap
      if(screen.containsKey(current)) {
        //if found calc the scrore.
        currentCount = screen.get(current);
        score += current.length()*(currentCount);
      }
      
      if(isCommandAdd) {
        //also increment the count
        screen.put(current, ++currentCount);
      }else {
        screen.put(current, --currentCount);
      }
    }
    return score;

  }

  public static void main(String[] args) {
    HackerRankHash hr = new HackerRankHash();
    int score = hr.processCommand("+race");
    System.out.println("Score:"+score+"\n");
    score = hr.processCommand("+space");
    System.out.println("Score:"+score+"\n");
    score = hr.processCommand("+rock");
    System.out.println("Score:"+score+"\n");
    score = hr.processCommand("+rocketeer");
    System.out.println("Score:"+score+"\n");
    score = hr.processCommand("+rocket");
    System.out.println("Score:"+score+"\n");

    hr.processCommand("-rock");

    score=hr.processCommand("+rock");
    System.out.println("Score:"+score+"\n");

    hr.processCommand("-space");

    score = hr.processCommand("+rockstar");
    System.out.println("Score:"+score+"\n");

    //hr.printMap();

  }

}
