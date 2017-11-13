package com.savitha.leetcode.tree;



public class isBST {
  BNode root;
  boolean isBST()
  {
    return isBSTHelper(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
  }
  private boolean isBSTHelper(BNode node,int min,int max) {
    if(node ==null)
      return true;
    if(node.data<min || node.data>max)
    {
      return false;     
    }
    return (isBSTHelper(node.left,min,node.data-1)&&(isBSTHelper(node.right,node.data+1,max)));
     
  }
  public static void main(String[] args) {
    
    isBST tree =new isBST();
    tree.root=new BNode(4);
    tree.root.left=new BNode(2);
    tree.root.left = new BNode(2);
    tree.root.right = new BNode(5);
    tree.root.left.left = new BNode(1);
    tree.root.left.right = new BNode(3);

    if (tree.isBST())
        System.out.println("IT IS a BST");
    else
        System.out.println("It is Not a BST");
  
  }

}
