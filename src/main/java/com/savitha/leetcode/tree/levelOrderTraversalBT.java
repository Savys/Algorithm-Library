package com.savitha.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;
/*                      40
 *                      /\ 
 *                    20  60
 *                   /\   /\
 *                  10 30 50 70
 * 
 * o/p
 * Level Order traversal of binary tree will be:
   40 20 60 10 30 50 70 
 * 
 * 
 * */
public class levelOrderTraversalBT {

  public static class TreeNode {
    int      data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
      this.data = data;
    }
  }

  public static void levelOrderTraversal(TreeNode startNode) {
    Queue queue = new LinkedList();
    queue.add(startNode);
    while (!queue.isEmpty()) {
      TreeNode tempNode = (TreeNode) queue.poll();
      System.out.printf("%d ", tempNode.data);
      if (tempNode.left != null)
        queue.add(tempNode.left);
      if (tempNode.right != null)
        queue.add(tempNode.right);
    }
  }

  public static void main(String[] args) {
    levelOrderTraversalBT bi = new levelOrderTraversalBT();
    // Creating a binary tree
    TreeNode rootNode = createBinaryTree();
    System.out.println("Level Order traversal of binary tree will be:");
    levelOrderTraversal(rootNode);
  }

  public static TreeNode createBinaryTree() {

    TreeNode rootNode = new TreeNode(40);
    TreeNode node20 = new TreeNode(20);
    TreeNode node10 = new TreeNode(10);
    TreeNode node30 = new TreeNode(30);
    TreeNode node60 = new TreeNode(60);
    TreeNode node50 = new TreeNode(50);
    TreeNode node70 = new TreeNode(70);

    rootNode.left = node20;
    rootNode.right = node60;

    node20.left = node10;
    node20.right = node30;

    node60.left = node50;
    node60.right = node70;

    return rootNode;
  }
}
