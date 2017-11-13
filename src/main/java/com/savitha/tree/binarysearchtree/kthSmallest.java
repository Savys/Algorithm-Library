package com.savitha.tree.binarysearchtree;

/*

 If k = num_nodes(left Subtree of T) + 1, then the answer is the value in node T
 If k < num_nodes(left Subtree of T) + 1, then the kth smallest is in the left sub-tree, so we reduce the problem to finding the kth smallest element in the left subtree.
 If k > num_nodes(left Subtree of T) + 1, then the kth smallest is in the right sub-tree, So, we reduce the problem to finding the { k - num_nodes(left subtree of T) - 1 } smallest element of the right subtree.
 */
public class kthSmallest {
  public static Node root;

  public int kthSmallest(Node root, int k) {

    int leftSubtreeCount = getNoOfNodes(root.left) + 1;
    System.out.println("getNodeCount:" + leftSubtreeCount);
    if (k == leftSubtreeCount) {
      return root.data;
    } else if (k < leftSubtreeCount) {
      return kthSmallest(root.left, k);
    } else {
      return kthSmallest(root.right, k - leftSubtreeCount);
    }
    
  }

  private int getNoOfNodes(Node currentNode) {
    if (currentNode == null) {
      return 0;
    }
    return 1 + getNoOfNodes(currentNode.left) + getNoOfNodes(currentNode.right);

  }

  public static void main(String[] args) {
    kthSmallest b = new kthSmallest();
    // b.insert(75);
    b.insert(50);
    b.insert(10);
    b.insert(80);
    b.insert(5);
    b.insert(30);
    b.insert(70);
    b.insert(90);
    b.insert(85);
    b.insert(2);

    // System.out.println("Method 1:");
    b.inorder();
    int no = b.getNoOfNodes(root.right);
    System.out.println("no:" + no);

    int smalletno=b.kthSmallest(root, 3);
    System.out.print(smalletno);

  }

  private void inorder() {
    inorderRec(root);
  }

  private void inorderRec(Node root) {
    if (root != null) {
      inorderRec(root.left);
      System.out.println(root.data);
      inorderRec(root.right);
    }

  }

  private void insert(int id) {
    Node newNode = new Node(id);
    if (root == null) {
      root = newNode;
      return;
    }
    Node current = root;
    Node parent = null;
    while (true) {
      parent = current;
      if (id < current.data) {
        current = current.left;
        if (current == null) {
          parent.left = newNode;
          return;
        }
      } else {
        current = current.right;
        if (current == null) {
          parent.right = newNode;
          return;
        }
      }
    }
  }
}