package savitha;

public class BTree {
  BNode root;
  BNode parent;

  public static void main(String[] args) {
    BTree theTree = new BTree();
    theTree.addNode(50, "Boss");
    theTree.addNode(25, "Vice President");
    theTree.addNode(15, "Office Manager");
    theTree.addNode(30, "Secretary");
    theTree.addNode(75, "Sales Manager");
    theTree.addNode(85, "Salesman 1");
    theTree.inOrderTraverseTree(theTree.root);
 /*
  *    Boss
  *    Vice President
  * 
  * */

  }

  private void inOrderTraverseTree(BNode focusNode) {
    if(focusNode !=null){
      inOrderTraverseTree(focusNode.leftChild);
      System.out.println(focusNode);
      inOrderTraverseTree(focusNode.rightChild);
      }
    
  }

  private void addNode(int key, String name) {
    BNode bnode = new BNode(key, name);
    if (root == null) {
      root = bnode;
    } else {
      BNode focusNode = root;
      while (true) {
        parent = focusNode;
        if (key < focusNode.key) {
          focusNode = focusNode.leftChild;
        }
        if (focusNode == null) {
          parent.leftChild = bnode;
          return; // All Done
        }
        else{
          focusNode = focusNode.rightChild;
          if (focusNode == null) {

          parent.rightChild = bnode;
          return; // All Done
          }         
          }
      }
    }

  }

}
