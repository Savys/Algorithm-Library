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

public class FlattenBTree {
  public TreeNode flatten(TreeNode a) {
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
  public static void main(String[] args) {
    FlattenBTree fbt=new FlattenBTree();
    fbt.createTree();
    
  }
  private void createTree() {
    TreeNode root= new TreeNode(1);
    root.left=new TreeNode(2);
    
    root.right=new TreeNode(5);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.right.left = new TreeNode(5);
    root.right.right = new TreeNode(6);    
    
  }
}
