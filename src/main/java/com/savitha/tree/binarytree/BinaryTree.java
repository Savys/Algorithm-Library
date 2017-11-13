/* create a  binary tree
 * InOrder Traversal
 * root to leaf path*/
package com.savitha.tree.binarytree;

import java.util.Arrays;

public class BinaryTree {
  static Node root;
  private static int nPath ;
  BinaryTree(int data){
    root=new Node(data);
  }
 
  BinaryTree(){
    root=null;
  }
 
  public static void main(String[] args) {
    BinaryTree tree=new BinaryTree();
    tree.root=new Node(1);
    
    
    tree.root.left=new Node(2);
    tree.root.right=new Node(3);
  
    tree.root.left.left=new Node(4);
    tree.root.left.right = new Node(5);
                /* 4 becomes left child of 2
                1
            /       \
            2          3
            /   \       /  \
            4    null  null  null
            /   \
            5 null
            */
    System.out.println("\nInorder traversal of binary tree is ");
    tree.printInorder();
    tree.rootToLeafpath(root);
  }

  private void rootToLeafpath(Node root) {
    int [] path=new int[512];
    
    printrootToLeafpath(root,path);
  }

 

  

  private void printrootToLeafpath(Node node, int []path) {
      processPath(node,path,0);
    
  }

  private void processPath(Node root, int[] path, int index) {
    if(null == root) {
      return;
    }
    path[index++]=root.data;
    if((root.left ==null) && (root.right ==null))
    {
      printPath(path,index);
      return;
    }
    processPath(root.left,path,index);
    processPath(root.right,path,index);
    
  }


  private void printPath(int[] path, int index) {
   
    System.out.printf("Root to Leaf path %d : ",++nPath);
    System.out.println(Arrays.toString(Arrays.copyOf(path,index)));
    return;
  }

  
  private void printInorder() {
    printInorder(root);
    
  }

  private void printInorder(Node node) {
    if(node ==null)
    {return;}
 
   printInorder(node.left);
   System.out.println(node.data);
   printInorder(node.right);
 
    
  }
  }