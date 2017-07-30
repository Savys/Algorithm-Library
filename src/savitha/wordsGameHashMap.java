package savitha;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class wordsGameHashMap {
  public static void main(String[] args) {
    wordsGameHashMap wg = new wordsGameHashMap();
    wg.calculateScore("+race");
    wg.calculateScore("+space");
    wg.calculateScore("+rock");
    wg.calculateScore("+rocketeer");
    wg.calculateScore("+rocket");
    wg.calculateScore("-rock");
    wg.calculateScore("+rock");
    wg.calculateScore("-space");
    wg.calculateScore("+rockstar");
    
  }

  private int calculateScore(String input) {
    Map<String, Integer> wordMap = new HashMap<String, Integer>();
    String charInput = input;
    String firstLetter = input.substring(0, 1);
    firstLetter = "+";
    for (int i = 1; i <= input.length(); i++) {
    //int i=1;
      for (int j = i + 1; j <= input.length(); j++) {
        String subInput = input.substring(i, j);
        System.out.println(subInput);

        if (firstLetter == "+") {
          if (wordMap.containsKey(subInput)) {
            wordMap.put(subInput, wordMap.get(subInput) + 1);
          } else {
            wordMap.put(subInput, 1);
          }
        } else if (firstLetter == "-") {
          wordMap.put(subInput, wordMap.get(subInput) - 1);
        }
      }
    }
    // Iterate through HashMap to print all duplicate characters of String
    Set<Map.Entry<String, Integer>> entrySet = wordMap.entrySet();
    System.out.printf("Hash Map is :");
    for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
     }
    return 1;
  }
}
