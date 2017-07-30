package savitha;

import java.util.ArrayList;
import java.util.List;

public class SortData {

  public static void main(String[] args) {
    int[] input = { 4, 9, 3, 12, 5, 6, 21, 7, 8 };
    // O/p
    // 4 12 6 8 9 3 5 21 7
    List<Integer>result=SortData1(input);
    System.out.print(result);
   }

  private static List<Integer> SortData1(int[] input) {
    List<Integer> sortedList = new ArrayList<Integer>();

    for (int i = 0; i < input.length; i++) {
      if (input[i] % 2 == 0) {
        sortedList.add(input[i]);
      }
    }
    //System.out.print(sortedList);
    for (int j = 0; j < input.length; j++) {
      if (input[j] % 2 == 1) {
        sortedList.add(input[j]);
      }
    }return sortedList;
  }
}
