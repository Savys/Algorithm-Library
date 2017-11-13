package com.savitha.graphs.WordLadder;

import java.util.List;

public class Ladder {
    private String lastWord;
    private int length;
    private List<String>path;
    
    public Ladder(List<String> path) {
      this.path=path;
      }
      
     public Ladder(List<String> path, int length, String lastWord) 
     {
      this.path=path;
      this.length=length;
      this.lastWord=lastWord;
     }
    public int getLength() 
    {
      return length;
    }
    public String getLastWord() {
      return lastWord;
     }
    public List<String> getPath() {
      return path;
    }
    public void setLength(int length) {
      this.length = length;
    }
    public void setPath(List<String> path) {
      this.path = path;
    }
}
