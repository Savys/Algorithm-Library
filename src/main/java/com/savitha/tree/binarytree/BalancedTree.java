/*An empty tree is height-balanced. A non-empty binary tree T is balanced if:
1) Left subtree of T is balanced
2) Right subtree of T is balanced
3) The difference between heights of left subtree and right subtree is not more than 1.*/
package com.savitha.tree.binarytree;

public class BalancedTree {

  public static void main(String args[]){
    Node root = new Node(5);
    root.left = new Node(10);
    root.right = new Node(15);
    root.left.left = new Node(20);
    root.left.right = new Node(25);
    root.right.left = new Node(30);
    root.right.right = new Node(35);    
    System.out.println(" Is Tree Balanced : " + (new BalancedTree()).checkBalance(root));
    root.right.right.right = new Node (40);
    root.right.right.right.right = new Node (45);
    System.out.println(" Is Tree Balanced : " + (new BalancedTree()).checkBalance(root));
  }
  public boolean checkBalance(Node root){
    int result = isBalanced(root);
    if(result>0){
      return true;
    }else{
      return false;
    }
  }
  public int isBalanced(Node root){
    if(root==null){
      return 0;
    }
    int leftH = isBalanced(root.left);
    if(leftH==-1){
      return -1;
    }
    int rightH = isBalanced(root.right);
    if(rightH==-1){
      return -1;
    }
    int diff = leftH-rightH;
    if(Math.abs(diff)>1){
      return -1;
    }
    return 1 + Math.max(leftH, rightH);
  }
}
