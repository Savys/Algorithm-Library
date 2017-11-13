package com.savitha.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BTInorderTraversal {
  public static class BTTreeNode{
    int data;
    BTTreeNode right;
    
    BTTreeNode left;
    BTTreeNode(int x)
    {
      this.data=x;
    }
    
  }

  public static void main(String[] args) {
    BTInorderTraversal bt=new BTInorderTraversal();
    BTTreeNode rootNode= bt.createBTree();
    System.out.println("Inorder Order traversal of binary tree :");
    inOrderRecursiveTraversal(rootNode);
    inOrderItirateTraversal(rootNode);
    

  }

  private static void inOrderRecursiveTraversal(BTTreeNode rootNode) {
     if(rootNode !=null){
    System.out.println(rootNode.data);
    inOrderRecursiveTraversal(rootNode.left);
    inOrderRecursiveTraversal(rootNode.right);
    }
    
  }
  public static void inOrderItirateTraversal(BTTreeNode startNode) {
    Queue queue=new LinkedList();
    queue.add(startNode);
    while(!queue.isEmpty())
    {
     BTTreeNode tempNode=(BTTreeNode) queue.poll();
     System.out.printf("%d ",tempNode.data);
     if(tempNode.left!=null)
      queue.add(tempNode.left);
     
     if(tempNode.right!=null)
      queue.add(tempNode.right);
    }
           }
  private BTTreeNode createBTree() {
    
    BTTreeNode rootNode=new BTTreeNode(40);
    BTTreeNode node20=new BTTreeNode(20);
    BTTreeNode node10=new BTTreeNode(10);
    BTTreeNode node30=new BTTreeNode(30);
    BTTreeNode node60=new BTTreeNode(60);
    BTTreeNode node50=new BTTreeNode(50);
    BTTreeNode node70=new BTTreeNode(70);
    
    rootNode.left=node20;
    rootNode.right=node60;
    
    node20.left=node10;
    node20.right=node30;
    
    node60.left=node50;
    node60.right=node70;
    
    return rootNode;
  }

}
