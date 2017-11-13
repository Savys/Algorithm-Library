package com.savitha.tree.binarytree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrderTraversalBT {

  public static class TreeNode {
    int      data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
      this.data = data;
    }
  }

  // prints in level order
 
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
  public static List<List<Integer>> levelOrder2(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
    
    if(root == null) return wrapList;
    
    queue.offer(root);//When element can not be added to collection the add method throws an exception and offer doesn't.
    while(!queue.isEmpty()){
        int levelNum = queue.size();
        List<Integer> subList = new LinkedList<Integer>();
        for(int i=0; i<levelNum; i++) {
            if(queue.peek().left != null) queue.offer(queue.peek().left);//Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
            if(queue.peek().right != null) queue.offer(queue.peek().right);
            subList.add(queue.poll().data);//The poll() method is used to retrieve and remove the head of this queue, or returns null if this queue is empty
        }
        wrapList.add(subList);
    }
    return wrapList;
}

  public static void main(String[] args) {
    levelOrderTraversalBT bi = new levelOrderTraversalBT();
    // Creating a binary tree
    TreeNode rootNode = createBinaryTree();
    System.out.println("Level Order traversal of binary tree will be:");
    //levelOrderTraversal(rootNode);
    List<List<Integer>>result2=levelOrder2(rootNode);//works better
    int maxresult = maxPathSum(rootNode);
    System.out.println("");
    System.out.println("MaxResult: " + maxresult);
    System.out.println("result2: " + result2);
  }

  public static int maxPathSum(TreeNode root) {
    int max[] = new int[1];
    max[0] = Integer.MIN_VALUE;
    calculateSum(root, max);
    return max[0];
  }

  public static int calculateSum(TreeNode root, int[] max) {
    if (root == null)
      return 0;

    int left = calculateSum(root.left, max);
    int right = calculateSum(root.right, max);

    int current = Math.max(root.data, Math.max(root.data + left, root.data + right));

    max[0] = Math.max(max[0], Math.max(current, left + root.data + right));

    return current;
  }

  public static TreeNode createBinaryTree() {

    /*
     * TreeNode rootNode =new TreeNode(40); TreeNode node20=new TreeNode(20);
     * TreeNode node10=new TreeNode(10); TreeNode node30=new TreeNode(30);
     * TreeNode node60=new TreeNode(60); TreeNode node50=new TreeNode(50);
     * TreeNode node70=new TreeNode(70);
     * 
     * rootNode.left=node20; rootNode.right=node60;
     * 
     * node20.left=node10; node20.right=node30;
     * 
     * node60.left=node50; node60.right=node70;
     */
    /*
    TreeNode rootNode = new TreeNode(1);
    TreeNode node2 = new TreeNode(2);
    TreeNode node3 = new TreeNode(3);
    TreeNode node4 = new TreeNode(4);
    
    rootNode.left = node2;
    rootNode.right = node3;
    node3.right=node4;
    */
    TreeNode rootNode = new TreeNode(3);
    TreeNode node9=new TreeNode(9); 
    TreeNode node20=new TreeNode(20); 
    TreeNode node15=new TreeNode(15); 
    TreeNode node7=new TreeNode(7); 
    
    rootNode.left = node9;
    rootNode.right = node20;
    node20.left = node15;
    node20.right = node7;
    return rootNode;
  }
}
