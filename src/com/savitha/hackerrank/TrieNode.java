package com.savitha.hackerrank;

public class TrieNode {

  private TrieNode parent;
  private TrieNode[] children;
  private boolean isLeaf;     //Quick way to check if any children exist
  private boolean isWord;     //Does this node represent the last character of a word
  private char character;     //The character this node represents
  
  public TrieNode(){
    children=new TrieNode[26];
    isLeaf=true;
    isWord=false;
  }
  public TrieNode(char character)
  {
     this();
     this.character = character;
  }
  protected void addWord(String word)
  {
    
  }
  /*
  protected TrieNode getNode(char c){
    return ;
  }*/
  /**
   * Returns a List of String objects which are lower in the
   * hierarchy that this node.
   * @return
   */
 /* protected List getWords(){
    
  }*/
}
