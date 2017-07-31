package com.savitha.ex2;


public class BinarySearchTree {
  public static  Node root;
  
  public BinarySearchTree(){
    this.root = null;
  }
  public static void main(String[] args) {
    BinarySearchTree b = new BinarySearchTree();
   /* b.insert(3);
    b.insert(8);
    b.insert(1);
    b.insert(4);
    b.insert(6);
    b.insert(2);*/
    
    b.insert(50);
    b.insert(10);
    b.insert(80);
    b.insert(5);
    b.insert(30);
    b.insert(70);
    b.insert(90);
    b.insert(85);
    b.insert(2);
   
    System.out.println("Original Tree : ");
    b.display(root);
    int min=b.findMin(root);
    int max= b.findMax(root);
    boolean bst =b.checkBST(root,min,max);
    System.out.println("\n Min of the tree:"+ min);
    System.out.println("\n Max of the tree:"+max);
    System.out.println("Check if it is BST :"+bst);
    }
  
  boolean checkBST(Node root,int min,int max){
    if(root == null)
    {
      return true;
    }
    if(root.data <min || root.data > max)
    {
     return false; 
    }
    return checkBST(root.left,min,root.data-1) && checkBST(root.right,root.data+1,max);
    
  }
  private void display(Node root) {
    if(root!=null){
      display(root.left);
      System.out.print(" " + root.data);
      display(root.right);
    }
    
  }
  private int findMin(Node root){

    if(root ==null) {
      System.out.println("Empty Tree");
    return -1;
    }
    if(root.left==null){
      return root.data;}
    return findMin(root.left);
  }
  private int findMax(Node root){

    if(root ==null) {
      System.out.println("Empty Tree");
    return -1;
    }
    if(root.right==null){
      return root.data;}
    return findMax(root.right);
  }
  private void insert(int id) {
    Node newNode = new Node(id);
    if(root==null){
      root = newNode;
      return;
    }
    Node current = root;
    Node parent = null;
    while(true){
      parent = current;
      if(id<current.data){        
        current = current.left;
        if(current==null){
          parent.left = newNode;
          return;
        }
      }else{
        current = current.right;
        if(current==null){
          parent.right = newNode;
          return;
        }
      }   
    }
  }
}
