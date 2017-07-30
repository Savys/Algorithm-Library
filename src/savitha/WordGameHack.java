package savitha;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WordGameHack {
  public int getHighestScore(String input) {
    int score=chkifPalindromeAndGetHS(input);
    return score;
  }

  private int chkifPalindromeAndGetHS(String input) {
    int k=input.length();
    int end=1;
    String maxOne="",maxTwo="";
    int maxLen=0,maxLen2=0,currlen,highScore;
    
    for (int i = 0; i < input.length(); i++) 
    {
      if(end <= i) {
        end = i;
      }
      for (int j = input.length() ; j > end; j--) 
      {
          String res = input.substring(i, j);
          int result = ifPalindrome(res);
          if(result==1) {
            //System.out.println("Res:" + res + " result:"+result+",i="+i+",j="+j+",k="+k+",end="+end);
            currlen=res.length();
            System.out.println("Palindrome:" + res + "len:" +currlen);
            if(currlen>maxLen)
            {
              maxTwo=maxOne;
              maxLen2=maxOne.length();
              
              maxOne =res;
              maxLen=res.length();
            }
            else if((currlen>maxLen2) && (currlen<maxLen))
            {
              maxTwo=res;
              maxLen2=currlen;
            }
            end = j;
            break;
          }
      }

    }
  System.out.println("maxLen: "+maxLen+"  maxLen2: "+maxLen2);
  highScore=maxLen*maxLen2;
  return highScore;
  }

  private  int ifPalindrome(String res) {
   int len=0;
   int i, ilength = res.length();
   if(ilength < 3) {
     return 0;
   }
   StringBuilder revStr = new StringBuilder();
     for (i = (ilength - 1); i >= 0; i--) {
     revStr.append(res.charAt(i));
   }
   if(res.equals(revStr.toString()))
   {
     return 1;
   }
    return 0;
  }

  public static void main(String[] args) {
          //String input ="abcde";
      String input ="malayalam";
     //input = "eeegeeksforskeeggeeks";
      //input = "abaefg";
     input="baaabbabbaaaaaaaababbbbababaaabaabbbbbbbbbababbabbaaaabbabbbbbababbbbabaabbbaaabaaabaabaabbbaababbababaaaabaabbaaaabaaabbbabbabbbbababaaaaaabbbababbbabbbbbbaaaaababbabbaabbabbbbbbaabbabababbbaabbababbbbababbbabaaabbaaaaabaaaababbaaababaaaaaaaabbaabaabbbabbaaaaabbaabaaabbbababbbbbaabbabaabbbbbabaababababbbbaabaaabbaaabaaababbbaaabbabbbabaababbbabbabbbbbabbaaabaabaaaababbabaabaaababbabbaaaababbaabbbbabaababbbaababbbabbbaabaabbbbaaaaabababbaabbababaaabaaaababbbbaaaaaabbbababbaababbbabbababbbaaabbaabbbbabbaaaaabbbbbbaaababbaaaababbbabbbabaaababbabaabaabbbbaabababaabbaaabaaabbaabbaaaaaaaabababaaabaabbaabbbbaaabaaaaaaababaababbababbaaabbaaabaaababaabbbabaabaaabababbbabababababaaaaababbaabbbaaaaababbabaaabaaaababaaabbaaaaaaaababababbbbabbabbbbbabaaabbbbaabaaabbbaaabababbbaabbaabbabbababaaaaabbaaabaabaaabbbababbbbababbbbaababaaaabbabbbaabbbbabababaabaabaaaabaabbbaaabbbbbababbbbbaababbbaabbaaabaabaababaabbaababbaaabaaaabaaaabbbaaabaaaababbbbabbbbbabbbbabbaaaabaaaaaababbaaaabaabbbababbbaabbbbaaaabbbabaababaabaabaaabbbbaababaaaabbaaaababbbaaabaaababbbbabbabbaaabbaaaabbaabbaaaaababbbbaababababaaabbaaaaabbbbaaaaababaaaabbbaabbbbbbaabaaaabbabbaaaabbaababbaabaaaaabbbabaabbbaabbaaaabbabaaababbaaaabababbbabbaababbaabbbbbabbaabaaabababaabbabaaaaaabababbabbaabbaaaaababaabababaaaaaaabbaaabbabbbbbbaabbbaaababbaabbbabababaabbaabababbbaabbbbbabbaaabbabbbbbbabbabbaabaaaababbaabbbbbbaababbaabbbbbabaaaabbaaabbabaabababababbbabababbbbbbaababbababaabbabbabbbabbaaaaabbbbbabbabbaaababbbbabbbaabbabbaaabababbbabbabaaabababaaabaabbbababaaaababbbabaaaabbbbaaaaabbbaaaaabaaaaaaaababaabaababababbaaaaaabaababbbabbbaabbbaaaababbabababaabbbaababaaaaaaabbbaaaaabababababbbbaaabbbbabbbbbaabaaabaaaaababbaabbababbbaaabaababbbbabbababaabbbaaabbaabbaababbaaabbbbbbbaabaababaaaaabababbbbbaaababaababbaabaaaaabaaabbbbaabbbababababbbbbbbaaabaabbabaabbaaabaaaaabbbaaabaababaabbabaabbabbbbbaaaabbbbbabbbaaabbaabaaaababbaaaabababaabaaaaaabaabbbaaaaaabbabbaabbbabbbbabababbaabbbbabbabbbabbaaabaabbbababbbbaaabbabbabaaaaaababaaaaababbabbaabbaabaaaaaaaababaabbbbaaabbababbaaababababbababababbaababbabbaaaabaaaaaaaabaaabaabaaaabbbbababbbabaaaaaaaaababaaabaabaabbaabaaaaaabaaaaaabbabbaabababbaabaabaababbbbaabbbaabaaaaabbaaabaababbbaabaaaaaaababbaaaaabaabaaaaaaabbabaaaaaabbbbbbaaaaaabbaaaaabaaabbabaababbababbbbbabbbbabababbabaaaabaaabaaaaaaaababbabbabaaabbbbbabbaaaabaabbbbbbbbababaaabaabaabbbaababbabaaaabbabaaabbaaaabbaabbababaabaabbabaabbbabbbbbababbaaaabbbabaaaaaaaaabaabbabbaabbbaaaabababbaabbabbbbbabaabbabbabbabbbaabbabbaabbabbbababbbaabbaabbbaaabaababbaabaaaabbbababbaaaabbababbbabbabbaaaabaaaabbaaaaaaaabbaabbbbaabbbbaabbbbaabbabaaabaaabbbbbaabaaabbabaabbbababbaabbbbbaaabbbaaaababbbbbaaaabaabbbabaabbbbbbaaabbbbaabbbabbabbbaabbbabbabaabbaabbbabaaabbbabbababaaaaaabbabaabbbbaababbaabbbabaaabbbbbbbbbbabaabbbbaaabaaaabbbbbaaabaaabaaabbabbaaaaaabbabbbaabaaaaaaabbbbaaababbabaabaabaabaabbbabaaabaaabbabaabbbaabaaaaababaaabbaaaabbbaaabaaaabbbababbbbaaaabbbaabbbaabaaababbabaababbaaaabbbabaaaabbababbbaabbbbaaabaabbabbabaa";
      WordGameHack wgh=new WordGameHack();
      int score=wgh.getHighestScore(input);
      System.out.println("Highest score : "+score);   
      }

 
}
