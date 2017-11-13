package com.savitha.graphs.WordLadder;

import java.util.ArrayList;

public class WordLadder1 {
  private ArrayList<String> words;

  public WordLadder1() {
      this.words = new ArrayList<String>();
  }

  public WordLadder1(WordLadder1 copy) {
      this();
      for (String nextWord: copy.words) {
          this.words.add(nextWord);
      }
  }

  public void addWord(String newWord) {
      this.words.add(newWord);
  }

  public void removeWord() {
      this.words.remove(this.words.size()-1);
  }

  public String endWord() {
      return this.words.get(this.words.size()-1);
  }

  public boolean contains(String word) {
      return this.words.contains(word);
  }

  public void append(WordLadder1 other) {
      for (String str : other.words) {
          this.addWord(str);
      }
  }

  public String toString() {
      return this.words.toString();
  }
}