package com.savitha.datastructure;
import com.savitha.Trie;


public class TriePractice {
  char c;
  Trie[] children;
  boolean word;
  public TriePractice()
  {
    this.c=0;
    this.children=new Trie[26];
    this.word=false;
  }
  public void add(String s)
  {
    if(s.isEmpty()){
      this.word=true;
      return;
    }
    char letter=s.charAt(0);
    int index=letter-'a';
    if(this.children[index]==null)
    {
      this.children[index]=new Trie();
    }
    this.children[index].add(s.substring(1)));
  }
  public static void main(String[] args) {
 

  }

}
