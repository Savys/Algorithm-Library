package com.savitha.tree.binarytree;

/*
Naive Approach:
Get the height of the tree.
Put a for loop for each level in tree.
for each level in step 2, do pre order tra­ver­sal and print only when height matches to the level.
Look at the code for bet­ter explanation
Time Com­plex­ity : O(N^2) — because each level you are tra­vers­ing the entire tree.

 *Bet­ter Solu­tion :   Time Com­plex­ity — O(N)

Cre­ate a ArrayList of Linked List Nodes.
Do the level order tra­ver­sal using queue(Breadth First Search). Click here to know about how to level order tra­ver­sal.
For get­ting all the nodes at each level, before you take out a node from queue, store the size of the queue in a vari­able, say you call it as levelNodes.
Now while levelNodes>0, take out the nodes and print it and add their chil­dren into the queue.
After this while loop put a line break.

 */
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
  public void levelOrderNaiveApproach(Node root) {
    int h = height(root);
    for (int i = 1; i <= h; i++) {
      printLevels(root, i);
      System.out.println("");
    }
  }

  public void printLevels(Node root, int h) {
    if (root == null)
      return;
    if (h == 1)
      System.out.print(" " + root.data);
    else {
      printLevels(root.left, h - 1);
      printLevels(root.right, h - 1);
    }
  }

  public int height(Node root) {
    if (root == null)
      return 0;
    return 1 + Math.max(height(root.left), height(root.right));
  }
   /* Using Queue is easiest implementation*/
  public void levelOrderQueue(Node root) {
    Queue q = new LinkedList();
    int levelNodes = 0;
    if (root == null)
      return;
    q.add(root);
    while (!q.isEmpty()) { //queue contains nodes to be processed.
      levelNodes = q.size();  //q size will be no of immediate children for that node 
      while (levelNodes > 0) {
        Node n = (Node) q.remove();
        System.out.print(" " + n.data);
        if (n.left != null)
          q.add(n.left);
        if (n.right != null)
          q.add(n.right);
        levelNodes--;
      }
      System.out.println("");
    }
  }

  public static void main(String[] args) throws java.lang.Exception {
    Node root = new Node(5);
    root.left = new Node(10);
    root.right = new Node(15);
    root.left.left = new Node(20);
    root.left.right = new Node(25);
    root.right.left = new Node(30);
    root.right.right = new Node(35);

    LevelOrderTraversal i = new LevelOrderTraversal();
    //System.out.println(" Output by Naive Approach : ");
    //i.levelOrderNaiveApproach(root);
    System.out.println(" Output by Better Approach : ");
    i.levelOrderQueue(root); //levelOrderQueue
  }
}
