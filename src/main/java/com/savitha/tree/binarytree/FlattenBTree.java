/*
 * Given a binary tree, flatten it to a linked list in-place. 
 * 
 Example :
 Given
 
 
 1
 / \
 2   5
 / \   \
 3   4   6
 The flattened tree should look like:
 
 1
 \
 2
 \
 3
 \
 4
 \
 5
 \
 6
 Note that the left child of all nodes should be NULL.
 */
package com.savitha.tree.binarytree;

import java.util.Stack;

import com.savitha.tree.binarytree.rootToLeaf.TreeNode;

public class FlattenBTree {
  private TreeNode prev = null;
  public TreeNode flatten(TreeNode a) { //Best method iteratively
    TreeNode result = new TreeNode(0);
    TreeNode node = result;
    result.right=node;
    if(a ==null) 
    {
      return null;
    }
   
    Stack<TreeNode> stack = new  Stack<TreeNode>();
    stack.add(a);
    
   while(!stack.isEmpty() )
   {
     TreeNode popped = stack.pop();
     node.right=popped;
     node.left=null;
     
     if(popped.right != null)
       stack.push(popped.right);
     if(popped.left != null)
       stack.push(popped.left);
   }
    
   return result.right;
 
  }
  
  public class FlattenTree {// Trace manually - Best method in recursion
    private TreeNode lastNode = null;
    public void flatten(TreeNode root) {
        if (root == null)
            return;
        if (lastNode != null)
        {
            lastNode.left = null;
            lastNode.right = root;
        }
        lastNode = root;
        TreeNode right = root.right;
        flatten(root.left);
        flatten(right);
             
         
    }
}
  public TreeNode flattenRe3(TreeNode root, TreeNode tail) {
    if (root == null) return tail;
    root.right = flattenRe3(root.left, flattenRe3(root.right, tail));
    root.left = null;
    return root;
}
  public void flatten_3(TreeNode root) {
    if (root == null) return;
    flattenRe3(root, null);
}

  public static void main(String[] args) {
    FlattenBTree fbt=new FlattenBTree();
    TreeNode rootNode = fbt.createTree();
    fbt.flatten(rootNode);
   // fbt.flatten2(rootNode);
    //fbt.flatten4(rootNode);
  }
  private void flatten4(TreeNode rootNode) {
    if (rootNode == null)
      return;
  flatten(rootNode.right);
  flatten(rootNode.left);
  rootNode.right = prev;
  rootNode.left = null;
  prev = rootNode;
    
  }
  private TreeNode createTree() {
    TreeNode root= new TreeNode(1);
    root.left=new TreeNode(2);
    
    root.right=new TreeNode(5);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.right.left = new TreeNode(5);
    root.right.right = new TreeNode(6);    
    return root;

    
  }
}
