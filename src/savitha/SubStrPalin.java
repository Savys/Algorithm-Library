package savitha;

import java.util.HashMap;
import java.util.Map;

public class SubStrPalin {
  public static void printSubStr(String input) {

    for (int i = 0; i < input.length(); i++) {
      for (int j = i + 1; j <= input.length(); j++) {
        String res = input.substring(i, j);
        TestifPalindrome(res);
      }
    }
  }

  private static void TestifPalindrome(String res) {
    int i, len = res.length();
    StringBuilder revStr = new StringBuilder();
    Map<String, Integer> hm = new HashMap<String, Integer>();
    for (i = (len - 1); i >= 0; i--) {
      revStr.append(res.charAt(i));
    }
    
   
      if (res.equals(revStr.toString())) {
          if(res.length() !=1){
              hm.put(res, res.length());}
      for (Map.Entry entry : hm.entrySet()) {
        System.out.println(entry.getKey() + ", " + entry.getValue());
      }
    }
  }

  public static void main(String[] args) {
    String s1 = "eee-g-ee-ksfor-skeeggeeks";
    String newInput=stripString(s1);
    System.out.println("s1:"+newInput);
    printSubStr(newInput);
    //printSubStr("eeegee"); 
  }

  private static String stripString(String s1) {
      s1=s1.replaceAll("-","");
      return s1;
  }

}
